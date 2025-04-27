package com.aits.iocdemo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IocdemoApplication {

	public static void main(String[] args) {
		//Tax t=new IncomeTax();
		//asking spring to create object
		//specify the path for spring 
		
//		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//		IncomeTax t=(IncomeTax) context.getBean("incomeTax");
//		t.setTaxableAmount(5000);
//		t.calculateTaxAmount();
//		System.out.println(t.getTaxAmount());
		
//		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(IocdemoApplication.class);
//		PropertyTax t=(PropertyTax) context.getBean(PropertyTax.class);
//		t.setTaxableAmount(5000);
//		t.calculateTaxAmount();
//		System.out.println(t.getTaxAmount());
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(IocdemoApplication.class);
		IncomeTax t=(IncomeTax) context.getBean(IncomeTax.class);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter payment mode: ");
		String paymode=sc.next();
		t.setTaxableAmount(5000);
		t.calculateTaxAmount();
		t.payTax(paymode);
	}

}
