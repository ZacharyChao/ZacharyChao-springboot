package com.zacharychao.quickstart.service;

import java.util.List;
import java.util.Map;

public interface UserService {
	List<Map<String,Object>> getAllUsers();
	
	boolean allowLogin(String username , String pwd);
}