package com.aits.mobileservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aits.mobileservice.entity.RechargeHistory;

public interface RechargeHistoryRepository extends JpaRepository<RechargeHistory, Long>{
	List<RechargeHistory> findByUserId(Long userId);
}
