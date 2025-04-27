package com.aits.iocdemo;

import org.springframework.stereotype.Component;

@Component
public class PropertyTax implements Tax{
	
	private double taxableAmount;
	private double taxAmount;
	private boolean isTaxPayed=false;
	private String taxType="Property";
	
	@Override
	public void setTaxableAmount(double amount) {
		// TODO Auto-generated method stub
		this.taxableAmount=amount;
	}

	@Override
	public void calculateTaxAmount() {
		// TODO Auto-generated method stub
		this.taxAmount=this.taxableAmount*0.05;
	}

	@Override
	public double getTaxAmount() {
		// TODO Auto-generated method stub
		return this.taxAmount;
	}

	@Override
	public String getTaxType() {
		// TODO Auto-generated method stub
		return this.taxType;
	}

	@Override
	public boolean isTaxPayed() {
		// TODO Auto-generated method stub
		return this.isTaxPayed;
	}

	@Override
	public void payTax() {
		// TODO Auto-generated method stub
		this.isTaxPayed=true;
	}
	
}
