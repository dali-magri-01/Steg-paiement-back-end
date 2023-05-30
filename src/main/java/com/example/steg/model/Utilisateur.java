package com.example.steg.model;

import jakarta.persistence.*;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private int cin;
    private String nom;
    private String prenom;
    @Column(unique = true)

    private String email;
    private String dateNais;
    private String motdepasse;
    private int numTlf;

    public Utilisateur(int cin, String nom, String prenom, String email, String dateNais, String motdepasse, int numTlf) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateNais = dateNais;
        this.motdepasse = motdepasse;
        this.numTlf = numTlf;
    }

    public Utilisateur() {
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNais() {
        return dateNais;
    }

    public void setDateNais(String dateNais) {
        this.dateNais = dateNais;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumTlf() {
        return numTlf;
    }

    public void setNumTlf(int numTlf) {
        this.numTlf = numTlf;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", cin=" + cin +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", dateNais='" + dateNais + '\'' +
                ", motdepasse='" + motdepasse + '\'' +
                ", numTlf=" + numTlf +
                '}';
    }
}
