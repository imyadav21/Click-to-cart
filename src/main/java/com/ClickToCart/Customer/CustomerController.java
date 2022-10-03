package com.ClickToCart.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerController {
	

	private final CustomerService customerService;
	
	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@RequestMapping("/")
	public String home()
	{
		return "index.html";
	}

	@GetMapping 
	public List <Customer> getCustomers()
	{
		return customerService.getCustomers();
	}
	
	@PostMapping
	public void registerNewCustomer(@RequestBody Customer customer) {
		
		customerService.addNewCustomer(customer);
		
		
		
	}

}
