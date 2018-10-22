package com.online.examination.centre;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CentreService {

	@Autowired
	private CentreRepository centreRepository;
	
	public List<Centre> getAllCentre()
	{
		List<Centre> franchisees = new ArrayList();
		centreRepository.findAll()
			.forEach(franchisees::add);
		return franchisees;
	}
	
	public Optional<Centre> getCentre(Integer id)
	{
		return centreRepository.findById(id);
	}
	
	public void addCentre(Centre centre)
	{
		centreRepository.save(centre);
	}
	
	public void updateCentre(Centre centre,Integer id)
	{
		centreRepository.save(centre);
	}
	
	public void deleteCentre(Centre centre,Integer id)
	{
		centreRepository.save(centre);
	}
}
