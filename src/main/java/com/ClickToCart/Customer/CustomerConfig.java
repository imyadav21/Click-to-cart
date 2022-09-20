package com.ClickToCart.Customer;


import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository repository) {
		return args -> {
			Customer yadav = new Customer(
					"Yadav",
					"yadav@gmail.com"
					);
			
			Customer anjali = new Customer(
					"Anjali",
					"anjali@gmail.com"
					);
			repository.saveAll(List.of(yadav, anjali));
			
		};
	}

}
