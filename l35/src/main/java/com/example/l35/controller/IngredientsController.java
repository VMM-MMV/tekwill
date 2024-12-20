package com.example.l35.controller;

import com.example.l35.model.Ingredient;
import com.example.l35.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/ingredients")
public class IngredientsController {

    @Autowired
    public IngredientRepository ingredientRepository;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Ingredient addIngredient(@RequestBody Ingredient ingredient) {
        System.out.println(ingredient);

        return ingredientRepository.save(new Ingredient("Lettuce", Ingredient.IngredientType.VEGGIES));
    }

    @GetMapping("/")
    public Iterable<Ingredient> getIngredients() {
        return ingredientRepository.findAll();
    }


}
