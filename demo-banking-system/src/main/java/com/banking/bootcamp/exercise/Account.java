package com.banking.bootcamp.exercise;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Account implements AccountInterface {
	private AccountHolder accountHolder;
	private Long accountNumber;
	private int pin;
	private double balance;

	protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {

		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = startingDeposit;
	}

	public AccountHolder getAccountHolder() {
		return this.accountHolder;
	}

	public boolean validatePin(int attemptedPin) {
		if (this.pin == attemptedPin) {
			return true;
		}
		return false;
	}

	public double getBalance() {
		return this.balance;
	}

	public double getPin() {
		return (double) this.pin;
	}

	public Long getAccountNumber() {
		return this.accountNumber;
	}

	public void creditAccount(double amount) {
		BigDecimal balance = BigDecimal.valueOf(this.balance)
				.add(BigDecimal.valueOf(amount));
				this.balance = balance.doubleValue();
	}

	public boolean debitAccount(double amount) {
		if (balance < amount) {
			return false;
		} else {
			this.balance = BigDecimal.valueOf(this.balance)
					.subtract(BigDecimal.valueOf(amount)).doubleValue();
		}
		return true;
	}
}