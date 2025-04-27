package com.aits.mobileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aits.mobileservice.entity.User;
import com.aits.mobileservice.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@GetMapping("/admin/usersexpiring")
	public List<User> getAllUsersExiring()
	{
		return adminService.getAllUsersExpiring();
	}
}
