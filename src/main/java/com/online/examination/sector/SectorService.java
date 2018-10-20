package com.online.examination.sector;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectorService {
	
	@Autowired
	private SectorRepository sectorRepository;
	
	public List<Sector> getAllSector(){
		List<Sector> sectors = new ArrayList();
		sectorRepository.findAll()
			.forEach(sectors::add);
		return sectors;
	}
	
	public Optional<Sector> getSector(Integer id) {
		return sectorRepository.findById(id);
	}

	public void addSector(Sector sector) {
		sectorRepository.save(sector);
	}
	
	public void updateSector(Sector sector,Integer id) {
		sectorRepository.save(sector);
	}
	
	public void deleteSector(Sector sector,Integer id) {
		sectorRepository.save(sector);
	}
}
