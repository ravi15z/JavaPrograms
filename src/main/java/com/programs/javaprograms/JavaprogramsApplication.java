package com.programs.javaprograms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.programs.javaprograms.java8.StreamApi;

@SpringBootApplication
public class JavaprogramsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaprogramsApplication.class, args);
		System.out.println("HELLO");
		streamPrograms();
	}

	private static void streamPrograms() {
		String highestLength = StreamApi.highestLength();
		System.out.println("Highest length word is:" + highestLength);
	}
}
