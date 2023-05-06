package com.example.echo_hack_planters.repository;

import com.example.echo_hack_planters.model.OrderMeal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMealRepository  extends JpaRepository<OrderMeal, Integer> {
}
