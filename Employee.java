package com.lab1.exercise;

public class Employee {

	private String firstName;
	private String lastName;
	private Long number;
	
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public Employee(String firstName, String lastName, long number) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
