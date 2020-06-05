package com.zat.coupon.web;

import com.springbootside.duang.exception.dto.ExceptionResultDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication(scanBasePackages = {"com.zat.coupon","com.springbootside.duang"})
//@ComponentScan(basePackages = {"com.zat.coupon.*","com.springbootside.duang.*"})
//@SpringBootApplication
//@ComponentScan(value = {"com.zat.coupon","com.springbootside.duang"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
