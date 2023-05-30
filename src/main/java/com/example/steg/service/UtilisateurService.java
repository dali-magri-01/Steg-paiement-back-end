package com.example.steg.service;

import com.example.steg.model.Utilisateur;

public interface UtilisateurService {
    public Utilisateur saveUtilisateur(Utilisateur utilisateur);
    public Utilisateur getUtilisateurbyemail(String email);

}
