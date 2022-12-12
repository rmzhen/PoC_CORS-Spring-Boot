package io.poc.corspoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CorsPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(CorsPocApplication.class, args);
	}

//	Uncomment the following method for global CORS.
//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/cors/method1").allowedOrigins("http://localhost:4201");
//				registry.addMapping("/cors/method2").allowedOrigins("http://localhost:4200");
//			}
//		};
//	}
}
