package com.banking.bootcamp.exercise;

public class Company extends AccountHolder {
	private String companyName;
	private int taxId;

	public Company(int taxId) {
		super(taxId);
	}

	public Company(String companyName, int taxId) {
		this(taxId);
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return this.companyName;
	}
}
