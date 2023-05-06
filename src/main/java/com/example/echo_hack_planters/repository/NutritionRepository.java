package com.example.echo_hack_planters.repository;

import com.example.echo_hack_planters.model.Nutrition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutritionRepository extends JpaRepository<Nutrition, Integer> {
}
