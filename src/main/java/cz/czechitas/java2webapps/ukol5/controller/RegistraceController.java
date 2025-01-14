package cz.czechitas.java2webapps.ukol5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

/**
 * Kontroler obsluhující registraci účastníků dětského tábora.
 */
@Controller
public class RegistraceController {
  private final Random random = new Random();

  @GetMapping("/")
    public ModelAndView formular() {
      ModelAndView modelAndView = new ModelAndView("formular");
      modelAndView.addObject("registForm", new RegistraceForm());
      return modelAndView;
    }

    @PostMapping("")
    public Object form(@ModelAttribute("registForm") @Valid RegistraceForm registraceForm, BindingResult bindingResult) {
      if (bindingResult.hasErrors()) {
        return "formular";
      }

      Period doba = registraceForm.getNarozeni().until(LocalDate.now());
      int vek = doba.getYears();

      if (vek > 18 || vek < 9) {
        bindingResult.rejectValue("narozeni", "", "Neodpovídáte potřebnému věku.");
        return "formular";
      }

      int vyberSportu = registraceForm.getOblibenySport().size();
      if (vyberSportu < 2) {
        bindingResult.rejectValue("oblibenySport", "", "Musíte vybrat minimálně dva sporty.");
        return "formular";
      }

      return new ModelAndView("/objednano")
              .addObject("kod", Math.abs(random.nextInt()))
              .addObject("email", registraceForm.getEmail());
    }

}
