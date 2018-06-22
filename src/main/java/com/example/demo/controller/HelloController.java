package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@Value("${cz.name}")
	private String name;
	@Value("${cz.org}")
	private String company;
	@RequestMapping("/sts")
	public String showInfo() {
		return name+"使用spring-tool-suite插件"+"输出公司名："+company;
	}
}
