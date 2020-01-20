package com.myCompany.jdbcTemplate20;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer=new Customer();
		customer.setId(rs.getString("id"));
		//customer.setFirstName(rs.getString("firstname"));
		customer.setFirstName(rs.getString("firstName"));
		customer.setLastName(rs.getString("lastName"));
		customer.setEmail(rs.getString("email"));
		return customer;
		
	}

}
