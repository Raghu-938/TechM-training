package com.aits.iocdemo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IncomeTax implements Tax {

	Map<String,PaymentProcessor> paymentProcessors	;
	
	@Autowired
	public IncomeTax(Map<String,PaymentProcessor> paymentProcessors) {
		this.paymentProcessors=paymentProcessors;
	}
	
//	public IncomeTax(@Qualifier("phonepay")PaymentProcessor p)
//	{
//		this.p=p;
//	}
//	

	private double taxableAmount;
	private double taxAmount;
	private boolean isTaxPayed=false;
	private String taxType="Savings";
	@Override
	public void setTaxableAmount(double amount) {
		// TODO Auto-generated method stub
		this.taxableAmount=amount;
		
	}
	@Override
	public void calculateTaxAmount() {
		// TODO Auto-generated method stub
		
		
		if(this.taxableAmount>=0 && this.taxableAmount<500000)
		{
			this.taxAmount=this.taxableAmount*0.05;
		}
		
		if(this.taxableAmount>=500000 && this.taxableAmount<1000000)
		{
			this.taxAmount=this.taxableAmount*0.1;
		}
		if(this.taxableAmount>=1000000 && this.taxableAmount<1500000)
		{
			this.taxAmount=this.taxableAmount*0.15;
		}
		if(this.taxableAmount>=1500000 )
		{
			this.taxAmount=this.taxableAmount*0.2;
		}
		
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
	public void payTax(String paymode) {
		// TODO Auto-generated method stub
		//p.doPayment();
		PaymentProcessor p=paymentProcessors.get(paymode);
		p.doPayment();
		this.isTaxPayed=true;
	}
}
