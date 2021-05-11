package cz.czechitas.java2webapps.ukol5.controller;

import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.EnumSet;

public class RegistraceForm {
    @NotBlank
    private String jmeno;
    @NotBlank
    private String prijmeni;
    @NotEmpty
    private LocalDate narozeni;
    @NotEmpty
    private Pohlavi pohlavi;
    @NotEmpty
    private SportEnum sport;
    @NotEmpty
    @NotBlank
    private String turnus;
    @Email
    @NotBlank
    private String email;
    @NumberFormat
    @NotBlank
    private String telefon;

    private EnumSet<SportEnum> oblibenySport;

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

    public SportEnum getSport() {
        return sport;
    }

    public void setSport(SportEnum sport) {
        this.sport = sport;
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
