package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.SujinVO;

@Mapper		// 붙이든 안 붙이든 자유인데 명시적인 표현이 명확할 수 있어 권장
public interface SujinMapper {
	// 기본적으로 5개를 집어넣는다, list, one, insert, update, delete -> 필요할 때 만드는 건 X
	// list
	public List<SujinVO> sujinList();
	
	// One 
	public SujinVO sujinOne(int sujinNum);
	
	// insert, update, delete를 mutation 메서드라 부른다.
	public int sujinInsert(SujinVO sujinVO);
	public int sujinUpdate(SujinVO sujinVO);
	public int sujinDelete(int sujinNum);
	
}
