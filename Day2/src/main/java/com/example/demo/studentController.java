package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class studentController {
	@GetMapping("/")
	public String homepage() {
		return "Welcome to student list";
	}
	@GetMapping("/list")
	public List<student>getList(){
		List<student> detailsList= new ArrayList<>();
		detailsList.add(new student(1,"Deepak",503));
		detailsList.add(new student(2,"Pandy",506));
		detailsList.add(new student(3,"kumar",510));
		return detailsList;
	}
	
	
	
}