package com.banking.bootcamp.exercise;

public interface BankInterface {
	Long openCommercialAccount(Company var1, int var2, double var3);

	Long openConsumerAccount(Person var1, int var2, double var3);

	boolean authenticateUser(Long var1, int var2);

	double getBalance(Long var1);

	void credit(Long var1, double var2);

	boolean debit(Long var1, double var2);

	Account getAccount(Long var1);
}