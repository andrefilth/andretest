package org.fiveware.test.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "org.fiveware.test.web", "org.fiveware.test.model", "org.fiveware.test.service" })
public class App {
	
	public static void main(final String[] args) {

		SpringApplication.run(App.class, args);
	}
}
