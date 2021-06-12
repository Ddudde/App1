package com.demo;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class);

	public static void main(String[] args) {
		Application.launch(Start.class);
	}

}
