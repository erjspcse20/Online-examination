package com.online.examination.coupan;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoupanService {
	@Autowired
	private CoupanRepository coupanRepository;
	
	public List<Coupan> getAllContest()
	{
		List<Coupan> contests = new ArrayList();
		coupanRepository.findAll()
			.forEach(contests::add);
		return contests;
	}
	
	public Optional<Coupan> getContest(Integer id)
	{
		return coupanRepository.findById(id);
	}
	
	public void addContest(Coupan coupan)
	{
		coupanRepository.save(coupan);
	}
	
	public void updateContest(Coupan coupan,Integer id)
	{
		coupanRepository.save(coupan);
	}
	
	public void deleteContest(Coupan coupan,Integer id)
	{
		coupanRepository.save(coupan);
	}
}
