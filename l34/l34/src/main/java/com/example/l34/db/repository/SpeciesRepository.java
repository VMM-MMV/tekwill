package com.example.l34.db.repository;

import com.example.l34.db.model.Animal;
import com.example.l34.db.model.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpeciesRepository extends JpaRepository<Species, Long> {
    List<Animal> getAllByIdEmptyAndAndNumAcres();
}
