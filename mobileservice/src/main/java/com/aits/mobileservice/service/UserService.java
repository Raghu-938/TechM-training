package com.aits.mobileservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.mobileservice.entity.User;
import com.aits.mobileservice.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public User insert(User user)
	{
		return userRepository.save(user);
	}
	
	public List<User> fetchAllUsers()
	{
		List<User> users=userRepository.findAll();
		return users;
	}
}
