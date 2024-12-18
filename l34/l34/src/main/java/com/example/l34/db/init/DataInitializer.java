package com.example.l34.db.init;

import com.example.l34.db.model.Animal;
import com.example.l34.db.model.Species;
import com.example.l34.db.repository.AnimalRepository;
import com.example.l34.db.repository.SpeciesRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

@Configuration
public class DataInitializer {

    @Bean
    public int initData(SpeciesRepository speciesRepository, AnimalRepository animalRepository) {
        Species elephant = new Species();
        elephant.setName("African Elephant");
        elephant.setNumAcres(BigDecimal.valueOf(7.5));

        Species zebra = new Species();
        zebra.setName("Zebra");
        zebra.setNumAcres(BigDecimal.valueOf(1.2));

        speciesRepository.saveAll(Arrays.asList(elephant, zebra));

        Animal elsa = new Animal();
        elsa.setSpecies(elephant);
        elsa.setName("Elsa");
        elsa.setDateBorn(LocalDateTime.of(2001, 5, 6, 2, 15, 0, 0));

        Animal zelda = new Animal();
        zelda.setSpecies(zebra);
        zelda.setName("Zelda");
        zelda.setDateBorn(LocalDateTime.of(2002, 8, 15, 9, 12, 0, 0));

        Animal ester = new Animal();
        ester.setSpecies(elephant);
        ester.setName("Ester");
        ester.setDateBorn(LocalDateTime.of(2002, 9, 9, 10, 36, 0, 0));

        Animal eddie = new Animal();
        eddie.setSpecies(elephant);
        eddie.setName("Eddie");
        eddie.setDateBorn(LocalDateTime.of(2010, 6, 8, 1, 24, 0, 0));

        Animal zoe = new Animal();
        zoe.setSpecies(zebra);
        zoe.setName("Zoe");
        zoe.setDateBorn(LocalDateTime.of(2005, 11, 12, 3, 44, 0, 0));

        animalRepository.saveAll(Arrays.asList(elsa, zelda, ester, eddie, zoe));
        return 0;
    }
}

