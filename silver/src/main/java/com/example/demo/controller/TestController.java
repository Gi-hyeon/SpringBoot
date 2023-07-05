package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@RestController	// 이걸 가장 많이 사용한다. Controller + ResponseBody
public class TestController {
	
	@GetMapping("/")
//	@ResponseBody // 이걸 붙이지 않아도 된다.
	public String getTest() {
		return "index";
	}
}
