package com.globalenterprise.apirestuser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globalenterprise.apirestuser.models.User;
import com.globalenterprise.apirestuser.service.UserService;

@RestController
@RequestMapping("/api")

public class UserRestController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> findAll() {

		return userService.findAll();
	}

	@GetMapping("/user/{userId}")
	public User getUser(@PathVariable int userId) {
		User user = userService.findById(userId);

		if (user == null) {
			throw new RuntimeException("User id not found -" + userId);
		}

		return user;
	}

	@PostMapping("/user")
	public User addUser(@RequestBody User user) {

		userService.save(user);

		return user;

	}

	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {

		userService.save(user);

		return user;
	}

	@DeleteMapping("user/{userId}")
	public String deteteUser(@PathVariable int userId) {

		User user = userService.findById(userId);

		if (user == null) {
			throw new RuntimeException("User id not found -" + userId);
		}

		userService.deleteById(userId);

		return "Deleted user id - " + userId;
	}

}
