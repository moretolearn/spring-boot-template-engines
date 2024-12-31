package com.moretolearn;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {

	@GetMapping("/rest") 
	public String restController() {
		return "{\"rest\":\"Hello Rest Controller\"}";
	}
	
	@GetMapping("/employees") 
	public List employee() {
		return new ArrayList<>();
	}
}
