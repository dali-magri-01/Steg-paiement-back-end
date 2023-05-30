package com.example.steg.service;

import com.example.steg.model.Facture;
import com.example.steg.model.HistoriqueFct;

import java.util.List;

public interface HistoFac {
     HistoriqueFct ajouter (HistoriqueFct e);
     List<HistoriqueFct> gethistorique(int cin);
}
