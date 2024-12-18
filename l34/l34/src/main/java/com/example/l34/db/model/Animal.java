package com.example.l34.db.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "species_id")
    private Species species;

    private String name;
    private LocalDateTime dateBorn;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(LocalDateTime dateBorn) {
        this.dateBorn = dateBorn;
    }
}
