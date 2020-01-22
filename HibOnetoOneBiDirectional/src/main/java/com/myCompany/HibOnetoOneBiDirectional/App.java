package com.myCompany.HibOnetoOneBiDirectional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.StaticFilterAliasGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Service ser;
	static{
		ser=new ServiceImpl();
		
	}
    public static void main( String[] args )throws IOException
    {
    	
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
    	/*SessionFactory factory = null;

	
		Session session = factory.getCurrentSession();
		session.getTransaction().begin();
		Album al =new Album("art",LocalDate.now());
		Image img = new Image("http://www.youtube.com");
		al.setImage(img);
		session.save(al);
		session.getTransaction().commit();
		System.out.println(al);*/
    	System.out.println("1");
		int choice=-1;
	    choice=Integer.parseInt(br.readLine().toString());
		switch (choice) {
		case 1:
			Album a=ser.create(new Album());
			System.out.println(a);
			break;
		case 2:
			
			  
		default:
			break;
		}


    	
    			

    }}
	

