package com.myCompany.HibOnetoOneBiDirectional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ServiceImpl implements Service{
	SessionFactory factory = null;
	BufferedReader br= null;
	@Override
	public Album create(Album album2) throws IOException 
	{
		 	factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Album.class).addAnnotatedClass(Image.class).buildSessionFactory();
		br= new BufferedReader(new InputStreamReader(System.in));
			
        String name= br.readLine();
		Session session = factory.getCurrentSession();
		session.getTransaction().begin();
		Album al =new Album(name,LocalDate.now());
		Image img = new Image("http://www.youtube.com");
		al.setImage(img);
		session.save(al);
		session.getTransaction().commit();
		System.out.println(al);
		return album2;
	}

	@Override
	public List<Album> getAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Album getPersonByid(Integer id) {
		
		return null;
	}

	@Override
	public Album updateAlbum(Integer id) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAlbum(Integer id) {
		// TODO Auto-generated method stub
		
	}
	

}