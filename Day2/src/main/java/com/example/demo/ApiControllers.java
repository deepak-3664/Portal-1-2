package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiControllers {
		private String Favcolor ="Red";
		@GetMapping("/")
		public String getcolor() {
			return "Welcome" + Favcolor;
		
	}

}
