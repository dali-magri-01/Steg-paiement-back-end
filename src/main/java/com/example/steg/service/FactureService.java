package com.example.steg.service;

import com.example.steg.model.Facture;

import java.util.List;

public interface FactureService {
    List<Facture>getfacturesbycin(int cin);
    public String supprimerfactur(int id);
}
