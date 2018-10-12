package com.online.examination.city;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;

import com.online.examination.state.State;

@Entity
public class CityServices{
	
	@Autowired
	private CityRepository cityRepository;
	
	public List<City> getAllCity(){
		List<City> cityes = new ArrayList();
		cityRepository.findAll()
			.forEach(cityes::add);
		return cityes;
	}
	
	public Optional<City> getCity(Integer id) {
		return cityRepository.findById(id);
	}
	
	public void addCity(City city) {
		cityRepository.save(city);
	}
	
	public void updateCity(Integer id,City city) {
		cityRepository.save(city);
	}
	
	public void deleteCity(Integer id,City city) {
		cityRepository.save(city);
	}
}
