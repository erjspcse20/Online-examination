package com.online.examination.franchisee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value="franchise/api")
public class FranchiseeController {

	@Autowired
	private FranchiseeService franchiseeService;
	
	@RequestMapping(value="/allFranchisee")
	public List<Franchisee> getAllFranchisee()
	{
		return franchiseeService.getAllFranchisee();
	}
	
	@RequestMapping(value="/getFranchisee/{id}")
	public Optional<Franchisee> getFranchisee(@PathVariable Integer id)
	{
		return franchiseeService.getFranchisee(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addFranchisee")
	public void addFranchisee(@RequestBody Franchisee franchisee)
	{
		franchiseeService.addFranchisee(franchisee);
	}

	@RequestMapping(value="/updateFranchisee/{id}")
	public void updateFranchisee(@RequestBody Franchisee franchisee,@PathVariable Integer id)
	{
		franchiseeService.updateFranchisee(franchisee, id);
	}

	@RequestMapping(value="/deleteFranchisee/{id}")
	public void deleteFranchisee(@RequestBody Franchisee franchisee,@PathVariable Integer id)
	{
		franchiseeService.deleteFranchisee(franchisee, id);
	}
}
