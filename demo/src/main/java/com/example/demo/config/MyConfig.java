package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//@EnableWebMvc	// 우린 JSP 별도 설정했으므로 필요 없음
public class MyConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		System.out.println("잘 실행되었는지 check?");
		registry.addResourceHandler("/upload/**") // 웹 접근 경로
				.addResourceLocations("file:///d:/MyTool/upload/"); // 서버내 실제 경로
	}

}