package com.online.examination.sector;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="sec/api")
public class SectorController {
	
	@Autowired
	private SectorService sectorService;
	
	@RequestMapping(value="/allSector")
	public List<Sector> getAllSector(){
		return sectorService.getAllSector();
	}
	
	@RequestMapping(value="/getSector/{id}")
	public Optional<Sector> getSector(@PathVariable Integer id) {
		return sectorService.getSector(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addSector")
	public void addSector(@RequestBody Sector sector) {
		sectorService.addSector(sector);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/updateSector/{id}")
	public void updateSector(@RequestBody Sector sector, @PathVariable Integer id) {
		sectorService.updateSector(sector, id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/deleteSector/{id}")
	public void deleteSector(@RequestBody Sector sector, @PathVariable Integer id){
		sectorService.deleteSector(sector, id);
	}
}
