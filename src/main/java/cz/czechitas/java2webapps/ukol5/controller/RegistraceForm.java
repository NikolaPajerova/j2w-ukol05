package cz.czechitas.java2webapps.ukol5.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.EnumSet;

public class RegistraceForm {
    @NotBlank
    private String jmeno;
    @NotBlank
    private String prijmeni;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NotNull
    private LocalDate narozeni;
    @NotNull
    private Pohlavi pohlavi;
    @NotEmpty
    @NotBlank
    private String turnus;
    @Email
    @NotBlank
    private String email;
    @NumberFormat
    @NotBlank
    private String telefon;

    private EnumSet<SportEnum> oblibenySport = EnumSet.noneOf(SportEnum.class); //přiřadí se prázdná množina = existuje, ale nemá prvky

    public EnumSet<SportEnum> getOblibenySport() {
        return oblibenySport;
    }

    public void setOblibenySport(EnumSet<SportEnum> oblibenySport) {
        this.oblibenySport = oblibenySport;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public LocalDate getNarozeni() {
        return narozeni;
    }

    public void setNarozeni(LocalDate narozeni) {
        this.narozeni = narozeni;
    }

    public Pohlavi getPohlavi() {
        return pohlavi;
    }

    public void setPohlavi(Pohlavi pohlavi) {
        this.pohlavi = pohlavi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTurnus() {
        return turnus;
    }

    public void setTurnus(String turnus) {
        this.turnus = turnus;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
