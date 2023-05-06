package com.example.echo_hack_planters.repository;

import com.example.echo_hack_planters.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal, Integer> {
}
