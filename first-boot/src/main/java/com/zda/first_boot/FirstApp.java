package com.zda.first_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//这个springboot服务器用来做cxf、feign的服务器
@SpringBootApplication
public class FirstApp {

	public static void main(String[] args) {
		SpringApplication.run(FirstApp.class, args);
	}
}
