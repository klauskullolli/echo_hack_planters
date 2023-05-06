package com.example.echo_hack_planters.repository;

import com.example.echo_hack_planters.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}
