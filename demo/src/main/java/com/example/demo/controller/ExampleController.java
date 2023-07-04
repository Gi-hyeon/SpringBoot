package com.example.demo.controller;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.vo.TestVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/")
public class ExampleController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	
//	@GetMapping("/home1")
//	@ResponseBody	// 붙으면 바로 직접 답변
//	public void restGet(HttpServletResponse res) throws Exception {
//		res.getWriter().write("<h1>home1 Manse</h1>");
//	}
	
	@GetMapping("/home1/{num}")
	@ResponseBody	// 붙으면 바로 직접 답변
	public String restGet(@PathVariable int num) {
		if (num == 1) {
			return "리턴1";
		}
		return "<h1>home1</h1>";
	}
	
	
//	@PostMapping(value = "/home1", produces = "application/json; charset=utf-8")
//	@ResponseBody
//	public List<String> restPost(@RequestBody List<String> names) {
//		
//		for(String name : names) {
//			System.out.println(name);
//		}
//		return names;
//	}
	
	// json 형식으로 보내면 Map으로 받아야한다.
//	@PostMapping(value = "/home1", produces = "application/json; charset=utf-8")
//	@ResponseBody
//	public List<Map<String, String>> restPost(@RequestBody List<Map<String, String>> myListMap) {
//		
//		for (Map<String, String> map : myListMap) {
//			System.out.println(map.get("name"));
//			System.out.println(map.get("age"));
//			System.out.println("====================");
//		}
//		
//		return myListMap;
//	}
	
	
	/*
	 * 대부분 클라이언트 <-> 값 주고 받기만 잘해도 자신감이 굿
	 * 데이터 타입이 이것저것 섞이면 어쩔 수 없이 모든 걸 받을 수 있는 최상우 Object가 와야한다.
	 * 필요하면 꺼낼 때 형변환을 해줘야한다.
	 * Map으로 자주 받게 되는 데이터가 있다면, 아예 별도 VO 형태로 만들자.
	 */
	@PostMapping(value = "/home1", produces = "application/json; charset=utf-8")
	@ResponseBody
	public List<TestVO> restPost(@RequestBody List<TestVO> myListMap) {
//	public List<Map<String, Object>> restPost(@RequestBody List<Map<String, Object>> myListMap) {
		
		for (TestVO testVO : myListMap) {
			System.out.println(testVO.getName());
			System.out.println(testVO.getAge());
			System.out.println("====================");
		}
		
		return myListMap;
	}
	
	@PostMapping(value = "/mfile", produces = "application/json; charset=utf-8")
	@ResponseBody
	// formData 받을 때는 @RequestBody를 사용하지 않음
	public String restfile(MultipartFile myFile) throws Exception, IOException {
		
		log.info("OriginalName : " + myFile.getOriginalFilename());
		log.info("size : " + myFile.getSize());
		
		
		String destPath = "d:/MyTool/upload/" + myFile.getOriginalFilename();
		myFile.transferTo(new File(destPath));
		
		return "/upload/" + myFile.getOriginalFilename();
	}
	
	
	@PutMapping(value = "/home1", produces = "application/json; charset=utf-8")
	@ResponseBody
	public List<TestVO> restPut(@RequestBody List<TestVO> myListMap) {
//	public List<Map<String, Object>> restPost(@RequestBody List<Map<String, Object>> myListMap) {
		
		for (TestVO testVO : myListMap) {
			System.out.println(testVO.getName());
			System.out.println(testVO.getAge());
			System.out.println("====================");
		}
		
		return myListMap;
	}
	
	@DeleteMapping(value = "/home1", produces = "application/json; charset=utf-8")
	@ResponseBody
	public List<TestVO> restDelete(@RequestBody List<TestVO> myListMap) {
//	public List<Map<String, Object>> restPost(@RequestBody List<Map<String, Object>> myListMap) {
		
		for (TestVO testVO : myListMap) {
			System.out.println(testVO.getName());
			System.out.println(testVO.getAge());
			System.out.println("====================");
		}
		
		return myListMap;
	}
	
	
}
