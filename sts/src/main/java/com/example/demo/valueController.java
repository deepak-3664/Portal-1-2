package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
@RestController
public class valueController {
	@Value("$(hello.value)")
	public valueController() {
		
	}

}
