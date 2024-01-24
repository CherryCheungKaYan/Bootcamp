package com.banking.bootcamp.exercise;

import java.util.ArrayList;
import java.util.List;

public class CommercialAccount extends Account {
	private List<Person> authorizedUsers = new ArrayList<>();

	// private Company company;
	// private Long accountNumber;
	// private int pin;
	// private double currentBalance;

	public CommercialAccount(Company company, Long accountNumber, int pin, double startingDeposit) {
		super(company, accountNumber, pin, startingDeposit);
	}

	protected void addAuthorizedUser(Person person) {
		authorizedUsers.add(person);
	}

	public boolean isAuthorizedUser(Person person) {
		return this.authorizedUsers.contains(person);
	}

}