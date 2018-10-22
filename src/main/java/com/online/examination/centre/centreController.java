package com.online.examination.centre;

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
public class centreController {
	@Autowired
	private CentreService centreService;
	
	@RequestMapping(value="/allCentre")
	public List<Centre> getAllCentre()
	{
		return centreService.getAllCentre();
	}
	
	@RequestMapping(value="/getCentre/{id}")
	public Optional<Centre> getCentre(@PathVariable Integer id)
	{
		return centreService.getCentre(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addCentre")
	public void addCentre(@RequestBody Centre Centre)
	{
		centreService.addCentre(Centre);
	}

	@RequestMapping(value="/updateCentre/{id}")
	public void updateCentre(@RequestBody Centre Centre,@PathVariable Integer id)
	{
		centreService.updateCentre(Centre, id);
	}

	@RequestMapping(value="/deleteCentre/{id}")
	public void deleteCentre(@RequestBody Centre Centre,@PathVariable Integer id)
	{
		centreService.deleteCentre(Centre, id);
	}
}
