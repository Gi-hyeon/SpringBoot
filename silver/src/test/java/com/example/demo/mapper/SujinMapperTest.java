package com.example.demo.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.vo.SujinVO;

@SpringBootTest
public class SujinMapperTest {
	
	@Autowired
	private SujinMapper sujinMapper;
	
	@Test	// Run as -> JUnit Test에서 검사가능
	@DisplayName("isnet mapper test")
	public void insertTest() {
		/*
		 * SujinVO sujinVO = new SujinVO();
		 * sujinVO.setSujinName("name SpringBootTest!");
		 * sujinVO.setSujinContent("content SpringBootTest!");
		 * 
		 * assertEquals(1, sujinMapper.sujinInsert(sujinVO));
		 */
		
		SujinVO sujinVO;
		for(int i=1; i<=20; i++) {
			sujinVO = new SujinVO();
			sujinVO.setSujinName("name SpringBootTest " + i);
			sujinVO.setSujinContent("contest SpringBootTest " + i);
			assertEquals(1, sujinMapper.sujinInsert(sujinVO));
		}
	}
	
}
