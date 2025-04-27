package com.aits.mobileservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aits.mobileservice.entity.RechargePlan;

public interface RechargeplanRepository extends JpaRepository<RechargePlan, Integer> {
	List<RechargePlan> findByCategory(String category);
}
