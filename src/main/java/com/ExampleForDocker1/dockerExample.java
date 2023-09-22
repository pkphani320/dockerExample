package com.ExampleForDocker1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class dockerExample {
	
	@GetMapping("/getMessage")
	public String getMessage() {
		return "example for docker";
	}

}
