package com.online.examination.contestlevel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContestLevelService {
	@Autowired
	private ContestLevelRepository contestLevelRepository;
	
	public List<ContestLevel> getAllContestLevel()
	{
		List<ContestLevel> Contests = new ArrayList();
		contestLevelRepository.findAll()
			.forEach(Contests::add);
		return Contests;
	}
	public Optional<ContestLevel> getContestLevel(Integer id)
	{
		return contestLevelRepository.findById(id);
	}
	
	public void addContestLevel(ContestLevel Contest)
	{
		contestLevelRepository.save(Contest);
	}
	
	public void updateContestLevel(ContestLevel Contest,Integer id)
	{
		contestLevelRepository.save(Contest);
	}
	
	public void deleteContestLevel(ContestLevel Contest,Integer id)
	{
		contestLevelRepository.save(Contest);
	}

	
}
