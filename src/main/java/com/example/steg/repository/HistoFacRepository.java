package com.example.steg.repository;

import com.example.steg.model.HistoriqueFct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoFacRepository extends JpaRepository<HistoriqueFct,Integer> {
    List<HistoriqueFct> getHistoriqueFctsByCin(int cin);
}
