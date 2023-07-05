package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.SujinMapper;
import com.example.demo.vo.SujinVO;

@Service
public class SujinServiceImpl implements SujinService {

	// 서비스는 매퍼(DAO)를 부른다.
	@Autowired
	private SujinMapper sujinMapper;
	
	@Override
	public List<SujinVO> sujinList() {
		return sujinMapper.sujinList();
	}

	@Override
	public SujinVO sujinOne(int sujinNum) {
		return sujinMapper.sujinOne(sujinNum);
	}

	@Override
	public int sujinInsert(SujinVO sujinVO) {
		return sujinMapper.sujinInsert(sujinVO);
	}

	@Override
	public int sujinUpdate(SujinVO sujinVO) {
		return sujinMapper.sujinUpdate(sujinVO);
	}

	@Override
	public int sujinDelete(int sujinNum) {
		return sujinMapper.sujinDelete(sujinNum);
	}

}
