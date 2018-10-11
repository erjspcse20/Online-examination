package com.online.examination.country;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "cou/api")
public class CountryController {
	@Autowired
	private CountryService CountryService;
	
	@RequestMapping("/Countrys")
	public List<Country> getAllCountrys() {
		return CountryService.getAllCountry();
	}
	
	@RequestMapping("/Countrys/{id}")
	public Optional<Country> getCountry(@PathVariable String id) {
		//either you can give same name as parameter argument 
		//or put path variable name of request mapping to path
		//variable
		return CountryService.getCountry(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/Countrys")
	public void addCountry(@RequestBody Country Country) {
		CountryService.addCountry(Country);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/Countrys/{id}")
	public void updateCountry(@RequestBody Country Country, @PathVariable String id) {
		CountryService.updateCountry(id, Country);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/Countrys/{id}")
	public void deleteCountry(@PathVariable String id) {
		CountryService.deleteCountry(id);
	}
}
