package com.hexaware.springrest1.entity;

import java.lang.System.Logger;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
//@Data

@Slf4j
public class Student {
	
	private long sid;
	private  String sname;
	private  String course;
	private  LocalDate dob;
	
	
	

}
