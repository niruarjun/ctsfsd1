package com.myCompany.HibInheritSinTableStrategyOne;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Session session=null;
		try {
			
			session=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(RegularEmployee.class).addAnnotatedClass(ContractEmployee.class).buildSessionFactory().getCurrentSession();
			Employee e1= new Employee("mani", LocalDate.now(), 10000);
			Employee e2=new RegularEmployee("niru", LocalDate.now(), 500000, "50000", "eng", "Ndl");
			Employee e3=new ContractEmployee("arjun", LocalDate.now(), 3999, "1000");
			session.getTransaction().begin();
			session.save(e1);
			session.save(e2);
			session.save(e3);
			session.getTransaction().commit();
			System.out.println("done");
		}
		finally {
			
		}
		
    }
}
