package com.example.steg.repository;

import com.example.steg.model.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface FactureRepository extends JpaRepository<Facture,Integer> {
    List<Facture> getFacturesByCin(int cin);
}
