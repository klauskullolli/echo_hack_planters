package com.example.echo_hack_planters.repository;

import com.example.echo_hack_planters.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz , Integer> {
}
