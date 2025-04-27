package com.aits.iocdemo;

public interface Tax {
	void setTaxableAmount(double amount);
	void calculateTaxAmount();
	double getTaxAmount();
	String getTaxType();
	boolean isTaxPayed();

	void payTax(String paymode);
}
