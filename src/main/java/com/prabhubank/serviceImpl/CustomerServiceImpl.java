package com.prabhubank.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prabhubank.model.Customer;
import com.prabhubank.repository.CustomerRepository;
import com.prabhubank.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Optional<Customer> findById(int cid) {
		return customerRepository.findById(cid);
	}

	@Override
	public Customer SaveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer newCustomer,int cid) {

		return customerRepository.findById(cid).map(customer -> {
			customer.setCity(newCustomer.getCity());
			customer.setContactNumber(newCustomer.getContactNumber());
			customer.setFirstName(newCustomer.getFirstName());
			customer.setLastName(newCustomer.getLastName());
			customer.setState(newCustomer.getState());
			return customerRepository.save(customer);
		}).orElseGet(() -> {
			newCustomer.setCid(cid);
			return customerRepository.save(newCustomer);
		});

	}

	
	@Override
	public void deleteCustomerById(int cid) {
		 customerRepository.deleteById(cid);
	}
}
