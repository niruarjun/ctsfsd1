package com.myCompany.jdbcTemplate20;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component

public class App 
{
	
	
    public static void main( String[] args )
    {
    	CustomerService service=null;
    	ClassPathXmlApplicationContext context=null;
    	
    	try {
    	    context=new ClassPathXmlApplicationContext("applicationcontext.xml");
    	    service=context.getBean("service",CustomerService.class);
    	    service.createCustomer(new Customer("233","ven","kat","ww@gm"));
    	    List<Customer> l=service.getAllCustomers();
    	    
			l.forEach(c->{
				System.out.println(c);
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
      
    }
}
