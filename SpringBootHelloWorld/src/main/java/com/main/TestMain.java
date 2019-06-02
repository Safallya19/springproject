package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.controller")
public class TestMain {

	public static void main(String[] args) {
		SpringApplication.run(TestMain.class,args);
       
	}

}
