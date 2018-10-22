package com.online.examination.subsector;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubSectorService {
	
	@Autowired
	private SubSectorRepository subSectorRepository;
	
	public List<SubSector> getAllSubsector()
	{
		List<SubSector> subsectors = new ArrayList();
		subSectorRepository.findAll()
			.forEach(subsectors::add);
		return subsectors;
	}
	
	public Optional<SubSector> getSubSector(Integer id)
	{
		return subSectorRepository.findById(id);
	}
	
	public void addSubSector(SubSector subsector)
	{
		subSectorRepository.save(subsector);
	}
	
	public void updateSubSector(SubSector subsector,Integer id)
	{
		subSectorRepository.save(subsector);
	}
	
	public void deleteSubSector(SubSector subsector,Integer id)
	{
		subSectorRepository.save(subsector);
	}
}
