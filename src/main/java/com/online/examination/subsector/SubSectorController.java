package com.online.examination.subsector;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="subsec/api")
public class SubSectorController {
	
	@Autowired
	private SubSectorService subSectorService;
	
	@RequestMapping(value="/allSubSector")
	public List<SubSector> getAllSubSector()
	{
		return subSectorService.getAllSubsector();
	}
	
	@RequestMapping(value="/getSubSector/{id}")
	public Optional<SubSector> getsubsector(@PathVariable Integer id)
	{
		return subSectorService.getSubSector(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addSubSector")
	public void addSubSector(@RequestBody SubSector subsector)
	{
		 subSectorService.addSubSector(subsector);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/updateSubSector/{id}")
	public void updateSubSector(@RequestBody SubSector subsector,@PathVariable Integer id) 
	{
		subSectorService.updateSubSector(subsector, id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/deleteSubSector/{id}")
	public void deleteSubsector(@RequestBody SubSector subSector,@PathVariable Integer id) {
		subSectorService.deleteSubSector(subSector, id);
	}
}
