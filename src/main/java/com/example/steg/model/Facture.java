package com.example.steg.model;

import jakarta.persistence.*;

@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private int cin;
    private Float consomation;
    private String dateExp;
    private Float prix ;

    public Facture(int cin, Float consomation, String dateExp, Float prix) {
        this.cin = cin;
        this.consomation = consomation;
        this.dateExp = dateExp;
        this.prix = prix;
    }

    public Facture() {
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

    public Float getConsomation() {
        return consomation;
    }

    public void setConsomation(Float consomation) {
        this.consomation = consomation;
    }

    public String getDateExp() {
        return dateExp;
    }

    public void setDateExp(String dateExp) {
        this.dateExp = dateExp;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "id=" + id +
                ", cin=" + cin +
                ", consomation=" + consomation +
                ", dateExp='" + dateExp + '\'' +
                ", prix=" + prix +
                '}';
    }
}
