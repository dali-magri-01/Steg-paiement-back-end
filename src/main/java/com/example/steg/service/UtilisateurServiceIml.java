package com.example.steg.service;

import com.example.steg.model.Utilisateur;
import com.example.steg.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurServiceIml implements UtilisateurService{
    @Autowired
    UtilisateurRepository utilisateurRepository;
    @Override
    public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur getUtilisateurbyemail(String email) {
        return utilisateurRepository.getUtilisateurByemail(email);
    }
}
