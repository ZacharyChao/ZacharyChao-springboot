package com.zacharychao.druid.example.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zacharychao.druid.example.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	public List<Map<String,Object>> getAllUsers(){
		return userMapper.getAllUser();
	}
}
