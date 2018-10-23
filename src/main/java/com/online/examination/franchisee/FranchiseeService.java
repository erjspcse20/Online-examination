package com.online.examination.franchisee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FranchiseeService {
	
	@Autowired
	private FranchiseeRepository franchiseeRepository;
	
	public List<Franchisee> getAllFranchisee()
	{
		List<Franchisee> franchisees = new ArrayList();
		franchiseeRepository.findAll()
			.forEach(franchisees::add);
		return franchisees;
	}
	
	public Optional<Franchisee> getFranchisee(Integer id)
	{
		return franchiseeRepository.findById(id);
	}
	
	public void addFranchisee(Franchisee franchisee)
	{
		franchiseeRepository.save(franchisee);
	}
	
	public void updateFranchisee(Franchisee franchisee,Integer id)
	{
		franchiseeRepository.save(franchisee);
	}
	
	public void deleteFranchisee(Franchisee franchisee,Integer id)
	{
		franchiseeRepository.save(franchisee);
	}
}
