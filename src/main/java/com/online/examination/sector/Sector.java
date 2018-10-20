package com.online.examination.sector;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sector {
	
	@Id
	private Integer id;
	private String Name;
	private String Description;
	private String createdBy;
	private Integer isActive;
	private Integer isDeleted;
	private Date createdAt;
	private Date updatedAt;
	private String UpdateBy;
	public Sector() {
		super();
	}
	public Sector(Integer id, String name, String description, String createdBy, Integer isActive, Integer isDeleted,
			Date createdAt, Date updatedAt, String updateBy) {
		super();
		this.id = id;
		Name = name;
		Description = description;
		this.createdBy = createdBy;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		UpdateBy = updateBy;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Integer getIsActive() {
		return isActive;
	}
	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}
	public Integer getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getUpdateBy() {
		return UpdateBy;
	}
	public void setUpdateBy(String updateBy) {
		UpdateBy = updateBy;
	}
	
	

}
