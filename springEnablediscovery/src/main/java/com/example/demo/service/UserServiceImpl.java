package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.models.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	 private UserDao userDao;

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user) ;
	}

	
}
