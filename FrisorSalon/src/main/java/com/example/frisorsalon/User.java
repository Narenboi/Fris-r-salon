package com.example.frisorsalon;

public class User {
    private  String fnavn;
    private String enavn;
    private int alder;
    private String konKategori;
    private double tlfNr;
    private String email;
    private String brugerNavn;
    private String password;

    public User(){

    }

    @Override
    public String toString() {
        return "User{" +
                "fnavn='" + fnavn + '\'' +
                ", enavn='" + enavn + '\'' +
                ", alder=" + alder +
                ", konKategori='" + konKategori + '\'' +
                ", tlfNr=" + tlfNr +
                ", email='" + email + '\'' +
                ", brugerNavn='" + brugerNavn + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(String fnavn, String enavn, int alder, String konKategori, double tlfNr, String email, String brugerNavn, String password){
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.alder = alder;
        this.konKategori = konKategori;
        this.tlfNr = tlfNr;
        this.email = email;
        this.brugerNavn = brugerNavn;
        this.password = password;

    }

    public String getFnavn() {
        return fnavn;
    }

    public void setFnavn(String fnavn) {
        this.fnavn = fnavn;
    }

    public String getEnavn() {
        return enavn;
    }

    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String getKonKategori() {
        return konKategori;
    }

    public void setKonKategori(String konKategori) {
        this.konKategori = konKategori;
    }

    public double getTlfNr() {
        return tlfNr;
    }

    public void setTlfNr(double tlfNr) {
        this.tlfNr = tlfNr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBrugerNavn() {
        return brugerNavn;
    }

    public void setBrugerNavn(String brugerNavn) {
        this.brugerNavn = brugerNavn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
