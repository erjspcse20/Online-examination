package com.online.examination.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="usr/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/getAllUser")
	public List<User> getAllUser()
	{
		return userService.getAllUser();
	}
	
	@RequestMapping(value="/getUser/{id}")
	public Optional<User> getUser(@PathVariable Integer id) {
		return userService.getuser(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addUser")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/updateUser/{id}")
	public void updateUser(@RequestBody User user,@PathVariable Integer id) {
		userService.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/deleteUser/{id}")
	public void deleteUser(@RequestBody User user,@PathVariable Integer id) {
		userService.deleteUser(user, id);
	}
	
}
