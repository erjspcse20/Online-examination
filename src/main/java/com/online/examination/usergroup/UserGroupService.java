package com.online.examination.usergroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserGroupService {

	@Autowired
	private UserGroupRepository usergroupRepository;
	
	public List<UserGroup> getAllUserGroup()
	{
		List<UserGroup> usergroups = new ArrayList();
		usergroupRepository.findAll()
			.forEach(usergroups::add);
		return usergroups;
	}	
	public Optional<UserGroup> getUserGroup(Integer id)
	{
		return usergroupRepository.findById(id);
	}
	public void addUserGroup(UserGroup usergroup)
	{
		usergroupRepository.save(usergroup);
	}
	public void updateUserGroup(UserGroup usergroup,Integer id)
	{
		usergroupRepository.save(usergroup);
	}
	public void deleteUserGroup(UserGroup usergroup,Integer id)
	{
		usergroupRepository.save(usergroup);
	}
}
