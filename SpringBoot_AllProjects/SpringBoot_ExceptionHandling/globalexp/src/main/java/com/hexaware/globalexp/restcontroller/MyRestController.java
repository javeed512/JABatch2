package com.hexaware.globalexp.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.globalexp.service.ServiceImp;

@RestController

@RequestMapping("/api")
public class MyRestController {

	@Autowired
	ServiceImp service;

	@GetMapping("/div/{n1}/{n2}")
	public String div(@PathVariable int n1, @PathVariable int n2) {

		int result = service.div(n1, n2);

		return "Result is: " + result;

	}

	@GetMapping("/calculate/{input}")
	public String calculate(@PathVariable String input) {

		int output = Integer.parseInt(input);

		return "Output is " + output;

	}

	/*
	 * @ExceptionHandler({ ArithmeticException.class })
	 * 
	 * @ResponseStatus(reason = "number cannot be div by zero", code =
	 * HttpStatus.FORBIDDEN) public void handleExp1() { // exception handler ,
	 * alternate of catch block in java
	 * 
	 * }
	 */

	@ExceptionHandler(NumberFormatException.class)
	public ResponseEntity<String> handleNFExp() {

		return new ResponseEntity<String>("Invalid Input format , plz enter input as digits", HttpStatus.BAD_REQUEST);

	}

}
