package com.banking.bootcamp.exercise;

public class Person extends AccountHolder {
	private String firstName;
	private String lastName;
	// private int idNumber;

	public Person(String firstName, String lastName, int idNumber) {
			super(idNumber);
			this.firstName = firstName;
			this.lastName = lastName;
	
	}

	public String getFirstName() {
			return firstName;
	}

	public String getLastName() {
			return lastName;
	}
}