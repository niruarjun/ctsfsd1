package com.myCompany.jdbcTemplate20;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
	public Customer createCustomer(Customer customer) throws SQLException;
	public List<Customer> getAllCustomers()throws SQLException;

}
