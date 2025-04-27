package com.aits.iocdemo;

import org.springframework.stereotype.Component;

@Component("creditcard")
public class Creditcard implements PaymentProcessor {
	@Override
	public void doPayment()
	{
		System.out.println("payment done through credit card");
	}

}
