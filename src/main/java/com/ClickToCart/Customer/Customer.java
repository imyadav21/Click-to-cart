package com.ClickToCart.Customer;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
	
	
	
	  @SequenceGenerator ( name = "customer_sequence", sequenceName =
	  "customer_sequence", allocationSize = 1 )
	 @GeneratedValue( strategy = GenerationType.SEQUENCE, generator =
	  "customer_sequence" )
	 
	 @Id 
	private long id;
	 
	
	private String name;
	private String email;

	
	

	
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	
	 public long getId() { return id; } public void setId(long id) { this.id = id;
	  }
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer() {
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
