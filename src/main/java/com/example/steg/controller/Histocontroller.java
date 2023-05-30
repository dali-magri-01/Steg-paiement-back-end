package com.example.steg.controller;

import com.example.steg.model.Facture;
import com.example.steg.model.HistoriqueFct;
import com.example.steg.service.HistoFac;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historique")
@CrossOrigin
public class Histocontroller {
    @Autowired
    HistoFac histoFac;


    @PostMapping("/add")
    public String add(@RequestBody HistoriqueFct e) {
        histoFac.ajouter(e);
        return "new Historique added";
    }

    @GetMapping("{cin}")
    List<HistoriqueFct> getFacturebycin (@PathVariable int cin)
    {
        return histoFac.gethistorique(cin);
    }

}
