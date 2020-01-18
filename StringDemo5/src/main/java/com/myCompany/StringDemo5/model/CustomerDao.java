package com.myCompany.StringDemo5.model;

import java.sql.SQLException;
import com.myCompany.StringDemo5.Customer;;

public interface CustomerDao {
	public Customer createCustomer(Customer customer)throws SQLException;
	

}
