package com.zacharychao.quickstart.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zacharychao.quickstart.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping("/api/v1/users")
	@ResponseBody
	public List<Map<String,Object>> getAllUser(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/api/v1/users/login")
	@ResponseBody
	public boolean allowLogin(String username,String pwd) {
		return userService.allowLogin(username, pwd);
	}
}
