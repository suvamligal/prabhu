package com.prabhubank.service;

import java.util.List;
import java.util.Optional;

import com.prabhubank.model.Customer;

public interface CustomerService {

	Customer SaveCustomer(Customer customer);

	List<Customer> findAll();

	Optional<Customer> findById(int cid);

	Customer updateCustomer(Customer customer, int cid);

	void deleteCustomerById(int cid);

}
