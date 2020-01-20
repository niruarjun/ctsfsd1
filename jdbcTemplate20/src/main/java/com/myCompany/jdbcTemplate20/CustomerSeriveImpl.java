package com.myCompany.jdbcTemplate20;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("service")
public class CustomerSeriveImpl implements CustomerService {
	private CustomerDao2 dao2;
	
	public CustomerSeriveImpl(CustomerDao2 dao2) {
		super();
		this.dao2 = dao2;
	}
	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		
		return dao2.createCustomer(customer);
		
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		
		 return dao2.getAllCustomers();
	}

}
