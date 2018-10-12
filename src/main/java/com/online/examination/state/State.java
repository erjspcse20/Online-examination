package com.online.examination.state;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State {
	@Id
	private Integer id;
	private String name;
	private String description;
	private Integer countryid;
	public State() {
		super();
	}

	public State(Integer id, String name, String description, Integer countryid) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.countryid = countryid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getCountryid() {
		return countryid;
	}

	public void setCountryid(Integer countryid) {
		this.countryid = countryid;
	}
}
