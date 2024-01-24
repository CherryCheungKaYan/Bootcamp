package com.banking.bootcamp.exercise;

public class Transaction implements TransactionInterface {
	private Long accountNumber;
	private Bank bank;

	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		this.bank = bank;
		if (this.bank.getAccount(accountNumber).getPin() == attemptedPin) {
			this.accountNumber = accountNumber;
		} else {
			throw new Exception("Wrong Pin No.");
		}
	}

	public double getBalance() {
		return this.bank.getAccount(this.accountNumber).getBalance();
	}

	public void credit(double amount) {
		this.bank.getAccount(this.accountNumber).creditAccount(amount);
	}

	public boolean debit(double amount) {
		return this.bank.getAccount(this.accountNumber).debitAccount(amount);
	}
}