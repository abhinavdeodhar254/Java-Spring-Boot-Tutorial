package com.javabrains.javabrains_spring_boot_tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//this is the shortcut to three annotations those are
public class JavabrainsSpringBootTutorialApplication {

	public static void main(String[] args)
	/*This is the entry point for a Spring Boot application. Let’s break it down line by line and understand what happens when you run this program.

	 */
	{
		SpringApplication.run(JavabrainsSpringBootTutorialApplication.class, args);
	}

}
