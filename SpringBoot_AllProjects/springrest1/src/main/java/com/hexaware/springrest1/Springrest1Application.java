package com.hexaware.springrest1;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hexaware.springrest1.entity.Student;

import lombok.extern.slf4j.Slf4j;

@Slf4j  //lombok
@SpringBootApplication
public class Springrest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springrest1Application.class, args);
		
		
		Student student = new Student(101, "raju", "java",LocalDate.now());
		
		System.out.println(student);
		
		System.out.println(student.getCourse());
		
		student.setCourse("Java Full Stack");
		
		System.out.println(student);
		
		log.info(student.toString());
		log.warn("this is warn from slf4j in lombok");
		
		
		
	}

}
