package com.prabhubank.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.prabhubank.model.CustomUserDetails;
import com.prabhubank.model.Customer;
import com.prabhubank.repository.CustomerRepository;

@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<Customer> optionalCustomer = customerRepository.findUserByUsername(username);

		optionalCustomer.orElseThrow(() -> new UsernameNotFoundException(username + "not found"));

		return optionalCustomer.map(CustomUserDetails::new).get();

	}

}
