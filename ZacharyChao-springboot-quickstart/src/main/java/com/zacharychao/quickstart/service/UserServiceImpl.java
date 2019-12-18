package com.zacharychao.quickstart.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zacharychao.quickstart.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	public List<Map<String,Object>> getAllUsers(){
		return userMapper.getAllUser();
	}
	@Override
	public boolean allowLogin(String username, String pwd) {
		int i = userMapper.getUserByNameAndPWD(username, pwd);
		return i>0?true:false;
	}
}
