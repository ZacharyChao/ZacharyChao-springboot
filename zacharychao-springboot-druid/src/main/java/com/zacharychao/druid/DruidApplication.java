package com.zacharychao.druid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.zacharychao.druid.example.mapper"})
public class DruidApplication {
	public static void main(String[] args) {
		SpringApplication.run(DruidApplication.class, args);
	}
}
