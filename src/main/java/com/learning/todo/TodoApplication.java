package com.learning.todo;

import com.fasterxml.jackson.core.json.JsonGeneratorImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		String s="rakesh";
		try {
			System.out.println(s.toLowerCase());
		}
		catch(Exception e){
			System.err.println("exception occurred for "+s);
			System.out.println(e.getMessage());
		}
		System.out.println("chit");
		SpringApplication.run(TodoApplication.class, args);
	}

}
