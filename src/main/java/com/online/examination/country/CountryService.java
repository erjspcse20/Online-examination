package com.online.examination.country;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	public List<Country> getAllCountry() {
		List<Country> Countrys = new ArrayList();
		countryRepository.findAll()
			.forEach(Countrys::add);
		return Countrys;
		
	}
	
	public Optional<Country> getCountry(String id) {
		//return countryRepository.findById(id);
		//return null;
		return countryRepository.findById(id);
	}

	public void addCountry(Country Country) {
		countryRepository.save(Country);
		
	}

	public void updateCountry(String id, Country Country) {
		countryRepository.save(Country);
		
	}

	public void deleteCountry(String id) {
		countryRepository.deleteById(id);
	}

}
