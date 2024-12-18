package com.example.l34.db.repository;

import com.example.l34.db.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> { }
