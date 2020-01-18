package com.myCompany.StringDemo5.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myCompany.StringDemo5.Customer;
@Component("dao")
public class CustomerDaoimpl implements CustomerDao  {
	private DataSource datasource;
	private Connection connection;
	private PreparedStatement pStatement;
	private static Logger logger=Logger.getLogger("com.myCompany.StringDemo5.model.CustomerDaoimpl");
	

	
	@Autowired
	public CustomerDaoimpl(DataSource datasource) {
		super();
		this.datasource = datasource;
	}
	@PostConstruct
	public void init()
	{
		
			try {
				logger.info("creating connection");
				connection=datasource.getConnection();
				logger.info("connection established.");
			} catch (SQLException e) {
				
				e.printStackTrace();
				logger.info("connection unsuccesfull.");
		
			}
	}
	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		pStatement=connection.prepareStatement("insert into customer(id,firstName,lastName,email) values(?,?,?,?)");
		pStatement.setString(1, customer.getId());
		pStatement.setString(2, customer.getFirstName());
		pStatement.setString(3, customer.getLastName());
		pStatement.setString(4, customer.getEmail());
		pStatement.executeUpdate();
		return customer;
		
}
			
}

