package com.banking.bootcamp.exercise;

public interface AccountInterface {
	AccountHolder getAccountHolder();

	boolean validatePin(int var1);

	double getBalance();

	Long getAccountNumber();

	void creditAccount(double var1);

	boolean debitAccount(double var1);

	double getPin();
}