package com.myCompany.ProfileComment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PostDaoImpl implements PostDao {

	@Override
	 @Transactional
	public PostDao createUser(PostDao postDao) {
		// TODO Auto-generated method stub
		return postDao;
	}
	

 
	
	}


