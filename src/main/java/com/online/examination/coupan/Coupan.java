package com.online.examination.coupan;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coupan {
	@Id
	private Integer id;
	private String franchiseeId;
	private String centreId;
	private String sectorId;	
	private String courseId;
	private String contestId;
	private String contestlevelId;
	private String name;
	private String description;
	private Integer coupanType;
	private Integer isActive;
	private Integer isDeleted;
	private String createdBy;
	private Date createdAt;
	private Date updatedAt;
	private String updatedBy;
	public Coupan() {
		super();
	}
	public Coupan(Integer id, String franchiseeId, String centreId, String sectorId, String courseId, String contestId,
			String contestlevelId, String name, String description, Integer coupanType, Integer isActive,
			Integer isDeleted, String createdBy, Date createdAt, Date updatedAt, String updatedBy) {
		super();
		this.id = id;
		this.franchiseeId = franchiseeId;
		this.centreId = centreId;
		this.sectorId = sectorId;
		this.courseId = courseId;
		this.contestId = contestId;
		this.contestlevelId = contestlevelId;
		this.name = name;
		this.description = description;
		this.coupanType = coupanType;
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
	public String getCentreId() {
		return centreId;
	}
	public void setCentreId(String centreId) {
		this.centreId = centreId;
	}
	public String getSectorId() {
		return sectorId;
	}
	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getContestId() {
		return contestId;
	}
	public void setContestId(String contestId) {
		this.contestId = contestId;
	}
	public String getContestlevelId() {
		return contestlevelId;
	}
	public void setContestlevelId(String contestlevelId) {
		this.contestlevelId = contestlevelId;
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
	public Integer getCoupanType() {
		return coupanType;
	}
	public void setCoupanType(Integer coupanType) {
		this.coupanType = coupanType;
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
