package com.myCompany.jdbcTemplate20;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("dao2")

public class CustomerDaoImplVersion2 implements CustomerDao2 {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into customer(id,firstName,lastName,email) values(?,?,?,?)";
		jdbcTemplate.update(sql, new Object[] { customer.getId(), customer.getFirstName(), customer.getLastName(),
				customer.getEmail() });
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {

		String query = "select id,firstName,lastName,email from customer";

		return jdbcTemplate.query(query, new CustomerRowMapper());
	}

}
