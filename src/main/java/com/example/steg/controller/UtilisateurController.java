package com.example.steg.controller;

import com.example.steg.model.Utilisateur;
import com.example.steg.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UtilisateurController {
    @Autowired
    UtilisateurService utilisateurService;

    @PostMapping("/add")
    public String saveUser(@RequestBody Utilisateur utilisateur)
    {utilisateurService.saveUtilisateur(utilisateur);
            return "add";

    }
    @GetMapping("/{email}")
    public Utilisateur getuserbyEmail (@PathVariable String email)
    {  Utilisateur utilisateur= utilisateurService.getUtilisateurbyemail(email);
        return utilisateur;
    }

}
