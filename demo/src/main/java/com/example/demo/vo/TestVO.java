package com.example.demo.vo;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString	// 이것은 디버깅용으로 아주 유용, 빼먹지말고 사용하자
public class TestVO {
	private String name;
	private List<String> age;
}
