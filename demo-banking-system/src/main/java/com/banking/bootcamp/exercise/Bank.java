package com.banking.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;// object reference
	public static Long accountNumberNo = Long.valueOf(123456789);

	public Bank() {
		this.accounts = new LinkedHashMap<>();
	}

	public Account getAccount(Long accountNumber) {
		return  this.accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		accountNumberNo++;
		Long ac = accountNumberNo;
		CommercialAccount commercialAccount = new CommercialAccount(company, ac, pin, startingDeposit);
		this.accounts.put(ac, commercialAccount);
		return ac;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		accountNumberNo++;
		Long pac = accountNumberNo;
		ConsumerAccount consumerAccount = new ConsumerAccount(person, pac, pin, startingDeposit);
		this.accounts.put(pac, consumerAccount);
		return pac;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		return this.accounts.get(accountNumber).getPin() == pin;
	}

	public double getBalance(Long accountNumber) {
		return this.accounts.get(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		this.accounts.get(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		return this.accounts.get(accountNumber).debitAccount(amount);

	}
}