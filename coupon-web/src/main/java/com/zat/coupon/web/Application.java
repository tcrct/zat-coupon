package com.zat.coupon.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.zat.coupon.*","com.springboot.side.duang.exception"})
//@ComponentScan(basePackages = {"com.zat.coupon.*","com.springbootside.duang.*"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
