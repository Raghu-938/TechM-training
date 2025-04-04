package controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aits.springjpademo.User;
import com.aits.springjpademo.UserRepo;

@Controller
public class UserController {
	@Autowired
	UserRepo repo;
	
	@PostMapping("/insertUsers")
	@ResponseBody
	public User insert(@RequestBody User user) {
		repo.save(user);
		return user;
	}
	@GetMapping("/users")
	@ResponseBody
	public String display() {
		return "hello";
	}
	
	@GetMapping("/getUsers")
	@ResponseBody
	public List<User> displayUsers(){
		return (List<User>)repo.findAll();
	}
	
	@PutMapping("/updateUsers/{id}")
	@ResponseBody
	public void updateUsers(@RequestBody User user, @PathVariable long id) {
		if(repo.existsById(id)) {
			user.setId(id);
			repo.save(user);
		}
	}
	
	@DeleteMapping("/deleteUsers/{id}")
	@ResponseBody
	public void deleteUsers(@PathVariable long id) {
		repo.deleteById(id);
	}
	
	@GetMapping("/getUser/{name}")
	@ResponseBody
	public List<Object[]> getUser(@PathVariable String name) {
		List<Object[]> u=repo.findByName(name);
		for(Object[] a:u) {
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
		}
		return u;
	}
	
	@GetMapping("/check/{name}")
	@ResponseBody
	public List<Object[]> check(@PathVariable String name) {
	    List<Object[]> result = repo.findMultiple(name);
	    
	    for (Object[] row : result) {
	        System.out.println("Dept: " + row[0] + ", ID: " + row[1]);
	    }
	    
	    return result;
	}


	
	
	
	
	
}
