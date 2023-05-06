package com.example.echo_hack_planters.repository;

import com.example.echo_hack_planters.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
