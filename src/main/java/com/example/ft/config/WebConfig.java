package com.example.ft.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		
		registry.addMapping("/**") // CORS를 적용할 URL 패턴을 정의
				.allowedOrigins("http://localhost:8090", "http://localhost:3000", 
						"http://내 ip:8090") // 자원 공유를 허락할 Origin을 지정
				.allowedMethods("GET", "POST", "PUT", "DELETE") // 허용할 HTTP method 지정
				.allowedHeaders("Authorization", "Content-Type", "Origin") // 클라이언트 측의 CORS 요청에 허용되는 헤더를 지정
				.exposedHeaders("Custom-Header") // 클라이언트측 응답에서 노출되는 헤더를 지정
				.allowCredentials(true) // 클라이언트 측에 대한 응답에 credentials(예: 쿠키, 인증 헤더)를 포함할 수 있는지 여부를 지정
				.maxAge(3600); // 원하는 시간만큼 pre-flight 리퀘스트를 캐싱
	}
}
