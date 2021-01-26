package com.prabhubank.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prabhubank.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	Optional<Customer> findUserByUsername(String username);


}
