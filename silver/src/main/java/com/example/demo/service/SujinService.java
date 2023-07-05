package com.example.demo.service;

import java.util.List;

import com.example.demo.vo.SujinVO;

// 기본식인 패턴은 Mapper 인터페이스와 똑같음
// 프로젝트 규모와 성격에 따라 다른 방향으로 진화
public interface SujinService {
	public List<SujinVO> sujinList();
	public SujinVO sujinOne(int sujinNum);
	public int sujinInsert(SujinVO sujinVO);
	public int sujinUpdate(SujinVO sujinVO);
	public int sujinDelete(int sujinNum);
}
