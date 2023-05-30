package com.example.steg.controller;

import com.example.steg.model.Facture;
import com.example.steg.service.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facture")
@CrossOrigin

public class FactureController {
    @Autowired
    FactureService factureService;


    @GetMapping("{cin}")
    List<Facture> getFacturebycin (@PathVariable int cin)
    {
        return factureService.getfacturesbycin(cin);
    }

    @DeleteMapping("/delete/{id}")
    public String supprimer (@PathVariable int id)
    {
        return factureService.supprimerfactur(id);
    }
}


