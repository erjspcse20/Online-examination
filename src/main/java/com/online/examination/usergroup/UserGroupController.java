package com.online.examination.usergroup;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.online.examination.contest.Contest;
import com.online.examination.contest.ContestService;

@RestController
@RequestMapping(value="usergroup/api")
public class UserGroupController {

	@Autowired
	private UserGroupService userGroupServices;
	
	@RequestMapping(value="/allUserGroup")
	public List<UserGroup> getAllContest()
	{
		return userGroupServices.getAllUserGroup();
	}
	
	@RequestMapping(value="/getUserGroup/{id}")
	public Optional<UserGroup> getUserGroup(@PathVariable Integer id)
	{
		return userGroupServices.getUserGroup(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addUserGroup")
	public void addUserGroup(@RequestBody UserGroup contest)
	{
		userGroupServices.addUserGroup(contest);
	}

	@RequestMapping(value="/updateUserGroup/{id}")
	public void updateUserGroup(@RequestBody UserGroup contest,@PathVariable Integer id)
	{
		userGroupServices.updateUserGroup(contest, id);
	}

	@RequestMapping(value="/deleteUserGroup/{id}")
	public void deleteUserGroup(@RequestBody UserGroup contest,@PathVariable Integer id)
	{
		userGroupServices.deleteUserGroup(contest, id);
	}
}
