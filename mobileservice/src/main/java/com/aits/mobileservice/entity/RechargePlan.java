package com.aits.mobileservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
public class RechargePlan {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private String category;
	private double price;
	
	private int validityIndays;
	
	public RechargePlan() {}
	public RechargePlan(String name, String category, double price, int validityIndays) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
		this.validityIndays = validityIndays;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getValidityIndays() {
		return this.validityIndays;
	}

	public void setValidityIndays(int validityIndays) {
		this.validityIndays = validityIndays;
	}

	

	
}
