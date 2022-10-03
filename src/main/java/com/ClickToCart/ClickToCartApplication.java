package com.ClickToCart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ClickToCart.Customer.CustomerRepository")
public class ClickToCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClickToCartApplication.class, args);
	}

}
