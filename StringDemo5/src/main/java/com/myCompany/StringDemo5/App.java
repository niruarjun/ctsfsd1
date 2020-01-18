package com.myCompany.StringDemo5;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import com.myCompany.StringDemo5.model.CustomerDao;;
@Component
public class App 
{
	
    public static void main( String[] args )
    {
        try {
        	  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        	  CustomerDao dao=context.getBean("dao",CustomerDao.class);
        	  Customer c=dao.createCustomer(new Customer(UUID.randomUUID().toString(),"John", "Doe", "john@email.com"));
        	  System.out.println(c);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
