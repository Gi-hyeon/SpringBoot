package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SujinService;
import com.example.demo.vo.SujinVO;

@RestController
@RequestMapping("/api")
public class SujinController {
	
	// 컨트롤러는 서비스를 부른다.
	@Autowired
	private SujinService sujinService;
	
	@GetMapping(value = "/sujins", produces = "application/json;charset=utf-8")
	public List<SujinVO> sujinList() {
		return sujinService.sujinList();
	}
	
	@GetMapping(value = "/sujin/{num}", produces = "application/json;charset=utf-8")
	public SujinVO sujinOne(@PathVariable("num") int sujinNum) {
		return sujinService.sujinOne(sujinNum);
	}
	
	// bomerang에서 test할 때 json형식으로 테스트
	@PostMapping(value = "/sujin", produces = "application/json;charset=utf-8")
//	@ResponseBody 생략되어있음
	public int sujinInsert(@RequestBody SujinVO sujinVO) {
		return sujinService.sujinInsert(sujinVO);
	}
	
	@PutMapping(value = "/sujin", produces = "application/json;charset=utf-8")
	public int sujinUpdate(@RequestBody SujinVO sujinVO) {
		return sujinService.sujinUpdate(sujinVO);
	}
	
	@DeleteMapping(value = "/sujin/{num}", produces = "application/json;charset=utf-8")
	public int sujinUpdate(@PathVariable("num") int sujinNum) {
		
		
		
		
		return sujinService.sujinDelete(sujinNum);
	}
	
	
}






















