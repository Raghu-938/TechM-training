package com.aits.empcrud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long>{
	Employee findByName(String Name);
}
