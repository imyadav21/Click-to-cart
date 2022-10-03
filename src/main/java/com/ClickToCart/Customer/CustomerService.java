package com.ClickToCart.Customer;
import com.ClickToCart.Customer.CustomerRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService  {
	
	private final CustomerRepository customerRepository;
	
	
	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}



	public List <Customer> getCustomers(){
		 return customerRepository.findAll();
	}



	public void addNewCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer);
		customerRepository.save(customer);
	}

}
