package com.example.steg.service;

import com.example.steg.model.Facture;
import com.example.steg.repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class FactureServiceIml implements FactureService{
    @Autowired
    FactureRepository factureRepository;

    @Override
    public List<Facture> getfacturesbycin(int cin) {
        return factureRepository.getFacturesByCin(cin);
    }

    @Override
    public String supprimerfactur(int id) {
        factureRepository.deleteById(id);
        return "ok";
    }
}
