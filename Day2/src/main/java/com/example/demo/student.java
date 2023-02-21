package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class student
{
	@JsonProperty("id")
	private int rollno;
	@JsonIgnoreProperties({"name","Rollno"})
	private String name;
	private int rank;
	
	public student(int rollno, String name, int rank)
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.rank = rank;
	}
	public student() {
		super();
		
	}
	
	public int getRollno()
	{
		return rollno;
	}
	public void setRollno(int rollno)
	{
		this.rollno = rollno;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getRank()
	{
		return rank;
	}
	public void setRank(int rank)
	{
		this.rank = rank;
	}


}
