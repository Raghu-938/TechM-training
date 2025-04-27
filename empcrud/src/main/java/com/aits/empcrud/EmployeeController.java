package com.aits.empcrud;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class EmployeeController {
	@Autowired
	EmployeeRepo emprepo;
//	
//	@GetMapping("/emp/{id}")
//	@ResponseBody
//	public Optional<Employee> display(@PathVariable Long id)
//	{
//		return emprepo.findById(id);
//	}
	
	@GetMapping("/emp/byname")
	@ResponseBody
	public Employee findByName(@RequestParam String name)
	
	{
		return emprepo.findByName(name);
		
	}
	
	@PostMapping("/emp")
	@ResponseBody
	public void insert(@RequestBody Employee emp)
	{
		emprepo.save(emp);
		//return emp;
	}
	
	@PutMapping("/emp/{id}")
	public void update(@RequestBody Employee emp,@PathVariable long id)
	{
		if(emprepo.existsById(id))
		{
			emp.setId(id);
			emprepo.save(emp);
		}
	}
	
	@PostMapping("/emp/{id}")
	@ResponseBody
	public void delete(@PathVariable long id)
	{
		emprepo.deleteById(id);
	}
} 
