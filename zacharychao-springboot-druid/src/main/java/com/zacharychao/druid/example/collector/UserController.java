package com.zacharychao.druid.example.collector;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zacharychao.druid.example.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/getAllUser")
	@ResponseBody
	public List<Map<String,Object>> getAllUsers(){
		return userService.getAllUsers();
	}
}
