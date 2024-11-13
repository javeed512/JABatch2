package com.hexaware.springrest1.restcontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody
@RequestMapping("/api")
public class HelloRestController {

	@GetMapping("/hello") // @RequestMapping(value="hello", method=Get)
	public String hello() {

		return "Hello Friends";

	}

	@GetMapping("/get")
	public String get() {

		return "Get request executed";

	}

	@PostMapping("/add") // @RequestMapping(value="hello", method=POST)
	public String add() {

		return "Data Added using POST method";

	}

	@PutMapping("/update")
	public String update() {

		return "data updated using PUT method";

	}

	@DeleteMapping("/delete")
	public String remove() {

		return "data removed using DELETE method";

	}

}
