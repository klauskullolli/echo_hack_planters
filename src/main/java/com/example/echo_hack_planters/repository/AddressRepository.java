package com.example.echo_hack_planters.repository;

import com.example.echo_hack_planters.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer > {
}
