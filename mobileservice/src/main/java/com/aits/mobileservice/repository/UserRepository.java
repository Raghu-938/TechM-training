package com.aits.mobileservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.aits.mobileservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByMobile(String mobile);
	Optional<User> findByEmail(String email);
}
