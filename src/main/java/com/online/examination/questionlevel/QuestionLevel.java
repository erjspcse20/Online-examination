package com.online.examination.questionlevel;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QuestionLevel {

	@Id
	private Integer id;
	private String franchiseeId;
	private String name;
	private String description;
	private Integer isActive;
	private Integer isDeleted;
	private String createdBy;
	private Date createdAt;
	private Date updatedAt;
	private String updatedBy;
	public QuestionLevel() {
		super();
	}
	public QuestionLevel(Integer id, String franchiseeId, String name, String description, Integer isActive,
			Integer isDeleted, String createdBy, Date createdAt, Date updatedAt, String updatedBy) {
		super();
		this.id = id;
		this.franchiseeId = franchiseeId;
		this.name = name;
		this.description = description;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFranchiseeId() {
		return franchiseeId;
	}
	public void setFranchiseeId(String franchiseeId) {
		this.franchiseeId = franchiseeId;
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
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
}
