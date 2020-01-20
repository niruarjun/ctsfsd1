package com.myCompany.jdbcTemplate20;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor

@Getter
@Setter
public class Customer {
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	public Customer(String id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [uid=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}
	
	

}
