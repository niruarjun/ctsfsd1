package service;

import dao.CustomerDAO;
import dao.CustomerDaoImpl;
import model.Customer;

public class CustomerServiceImpl implements CustomerService {	
		private CustomerDAO dao;
		{
			dao=new CustomerDaoImpl();
		}
		@Override
		public Customer createCustomer(Customer customer) {
			return dao.createCustomer(customer);
		}
	}
	


		