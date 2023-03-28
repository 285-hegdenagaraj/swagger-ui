package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SuppressWarnings("deprecation")
@SpringBootApplication
@EnableSwagger2
@EnableSwagger2WebMvc
@ComponentScan("com.example.demo")
public class SwaggerUiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerUiApplication.class, args);
	}

}
