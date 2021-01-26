package com.prabhubank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.prabhubank.repository.CustomerRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = CustomerRepository.class)
public class PrabhuApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrabhuApplication.class, args);
	}

}
