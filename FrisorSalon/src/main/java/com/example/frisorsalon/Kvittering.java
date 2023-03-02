package com.example.frisorsalon;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class Kvittering extends Tidsbestilling {


    private Integer kvitID;
    private String dato;
    private String tidspunkt;
    private String kfnavn;
    private String kenavn;
    private Integer mnr;



    public void indsaetKvittering(kvittering k) {
        try {
            String sql = "INSERT INTO kvittering (kvitID, dato, tidspunkt, kfnavn, kenavn, mnr) VALUES('" +
                    k.getKvitID() + "','" + k.getDato() + "','";
            sql = sql + k.getTidspunkt() + "','" + k.getKfnavn() + "','" + k.getKenavn() + "','" + k.getMnr() + "')";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public kvittering alleoplysninger() {
        // String sql = "SELECT * from studerende left join studfag on studerende.stdnr=studfag.stdnr left join fag on studfag.fagnr=fag.fagnr order by stdnr";
        String sql = "select * from kvittering";
        try {
            Statement stmt = connection.createStatement();
            Statement stmt1 = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                kvittering k = new kvittering();
                int nr = rs.getInt("kvitID");
                k.setKvitID(nr);
                k.setDato(rs.getString("dato"));
                k.setTidspunkt(rs.getString("tidspunkt"));
                k.setKfnavn(rs.getString("kfnavn"));
                k.setKenavn(rs.getString("kenavn"));
                k.setMnr(rs.getInt("mnr"));
                String sql1 = "SELECT * from kvittering left join tidsbestilling on kvittering.kvitID=tidsbestilling.mnr where kvitID.mnr=" + nr;
                ResultSet rs1 = stmt1.executeQuery(sql1);
                //while (rs1.next()) {
                //kvittering kvit = new kvittering();
                //k..add(kvit);
                //}
                tabel.add(k);
            }
            stmt.close();
            stmt1.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return tabel;
    }



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
}


