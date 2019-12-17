package com.zacharychao.quickstart.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class TestController {
	@RequestMapping("/test")
	@ResponseBody
	public List<String> test() {
		return Arrays.asList("1","2","3","4");
	}
	@RequestMapping("/testJSP")
	public String testJSP() {
		return "hello";
	}
}
