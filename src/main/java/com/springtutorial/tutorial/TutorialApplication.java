package com.springtutorial.tutorial;

import com.springtutorial.tutorial.model.SecondClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
	}

	@Bean
	public SecondClass getSecondClass () {
		return new SecondClass();
	}

}
