package com.example.frisorsalon;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class Kvittering extends Tidsbestilling {


    private Integer kvitID;
    private String dato;

    public Integer getKvitID() {
        return kvitID;
    }

    public void setKvitID(Integer kvitID) {
        this.kvitID = kvitID;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public String getKfnavn() {
        return kfnavn;
    }

    public void setKfnavn(String kfnavn) {
        this.kfnavn = kfnavn;
    }

    public String getKenavn() {
        return kenavn;
    }

    public void setKenavn(String kenavn) {
        this.kenavn = kenavn;
    }

    public Integer getMnr() {
        return mnr;
    }

    public void setMnr(Integer mnr) {
        this.mnr = mnr;
    }

    private String tidspunkt;
    private String kfnavn;
    private String kenavn;
    private Integer mnr;




}


