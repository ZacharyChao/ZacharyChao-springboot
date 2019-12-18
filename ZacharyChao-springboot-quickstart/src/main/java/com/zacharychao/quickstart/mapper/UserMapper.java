package com.zacharychao.quickstart.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper {
	@Select("select * from users")
	List<Map<String ,Object>> getAllUser();
	
	@Select("select count(0) from users u where u.username = #{param1} and u.pwd = #{param2}")
	int getUserByNameAndPWD(String username,String pwd);
}
