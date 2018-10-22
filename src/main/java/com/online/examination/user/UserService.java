package com.online.examination.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUser()
	{
		List<User> users = new ArrayList();
		userRepository.findAll()
			.forEach(users::add);
		return users;
	}
	
	public Optional<User> getuser(Integer id)
	{
		return userRepository.findById(id);
	}
	
	public void addUser(User user)
	{
		userRepository.save(user);
	}
	
	public void updateUser(User user,Integer id)
	{
		userRepository.save(user);
	}
	
	public void deleteUser(User user,Integer id)
	{
		userRepository.save(user);
	}
}
