package com.aits.springjpademo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepo extends CrudRepository<User, Long> {
	List<Object[]> findByName(String name);
	
	@Query("SELECT u.dept, u.id FROM User u WHERE u.name = :uname")
	List<Object[]> findMultiple(@Param("uname") String uname);

}
