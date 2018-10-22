package com.online.examination.subsector;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SubSector {
	@Id
	private Integer id;
	private String sectorId;
	private String name;
	private String description;
	private String createdBy;
	private Date createdAt;
	private String updatedBy;
	private Date updatedAt;
	public SubSector() {
		super();
	}
	public SubSector(Integer id, String sectorId, String name, String description, String createdBy, Date createdAt,
			String updatedBy, Date updatedAt) {
		super();
		this.id = id;
		this.sectorId = sectorId;
		this.name = name;
		this.description = description;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedBy = updatedBy;
		this.updatedAt = updatedAt;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSectorId() {
		return sectorId;
	}
	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
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
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
