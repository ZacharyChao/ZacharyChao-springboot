package com.zacharychao.druid.example.collector;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zacharychao.druid.example.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/getAllUser")
	public List<Map<String,Object>> getAllUsers(){
		return userService.getAllUsers();
	}
}
