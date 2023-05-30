package com.example.steg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity

public class HistoriqueFct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cin;
    private int idFacture;

    private String date;
    private Float prix;

    public HistoriqueFct(int cin, int idFacture, String date, Float prix) {
        this.cin = cin;
        this.idFacture = idFacture;
        this.date = date;
        this.prix = prix;
    }

    public HistoriqueFct() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public int getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(int idFacture) {
        this.idFacture = idFacture;
    }

    @Override
    public String toString() {
        return "HistoriqueFct{" +
                "id=" + id +
                ", cin=" + cin +
                ", idFacture=" + idFacture +
                ", date='" + date + '\'' +
                ", prix=" + prix +
                '}';
    }
}
