package com.aits.mobileservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.mobileservice.entity.RechargePlan;
import com.aits.mobileservice.repository.RechargeplanRepository;

@Service
public class RechargePlanService {
	@Autowired
	private RechargeplanRepository repository;
	
	public List<RechargePlan> getAllPlans()
	{
		return repository.findAll();
	}
	
	public List<RechargePlan> getPlansByCategory(String category)
	{
		return repository.findByCategory(category);
	}
	
	public RechargePlan insert(RechargePlan rechargePlan)
	{
		return repository.save(rechargePlan);
	}
}
