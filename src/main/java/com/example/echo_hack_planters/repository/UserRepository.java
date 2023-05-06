package com.example.echo_hack_planters.repository;

import com.example.echo_hack_planters.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
