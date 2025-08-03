package com.programs.javaprograms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.programs.javaprograms.arrayPrograms.ArrayPrograms;
import com.programs.javaprograms.java8.StreamApi;
import com.programs.javaprograms.stringPr.String2CharPr;

@SpringBootApplication
public class JavaprogramsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaprogramsApplication.class, args);
		System.out.println("HELLO");

		System.out.println("######  String Programs  ######");
		String2CharPr string2CharPr = new String2CharPr();
		string2CharPr.convertStringToChar();

		System.out.println("######  Array Programs  ######");
		ArrayPrograms arp = new ArrayPrograms();
		arp.getArrayPrograms();
		streamPrograms();
	}

	private static void streamPrograms() {
		String highestLength = StreamApi.highestLength();
		System.out.println("Highest length word is:" + highestLength);
	}
}
