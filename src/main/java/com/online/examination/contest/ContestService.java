package com.online.examination.contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContestService {
	@Autowired
	private ContestRepository contstRepository;
	
	public List<Contest> getAllContest()
	{
		List<Contest> Contests = new ArrayList();
		contstRepository.findAll()
			.forEach(Contests::add);
		return Contests;
	}	
	public Optional<Contest> getContest(Integer id)
	{
		return contstRepository.findById(id);
	}
	public void addContest(Contest Contest)
	{
		contstRepository.save(Contest);
	}
	public void updateContest(Contest Contest,Integer id)
	{
		contstRepository.save(Contest);
	}
	public void deleteContest(Contest Contest,Integer id)
	{
		contstRepository.save(Contest);
	}
}
