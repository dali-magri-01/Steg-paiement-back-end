package com.example.steg.service;

import com.example.steg.model.HistoriqueFct;
import com.example.steg.repository.HistoFacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service


public class HistoFacIml implements HistoFac {
    @Autowired
    HistoFacRepository histoFacRepository;

    @Override
    public HistoriqueFct ajouter(HistoriqueFct e) {
        return histoFacRepository.save(e);
    }

    @Override
    public List<HistoriqueFct> gethistorique(int cin) {
        return histoFacRepository.getHistoriqueFctsByCin(cin);
    }
}
