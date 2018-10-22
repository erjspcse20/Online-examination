package com.online.examination.user;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private Integer id;
	private String fname;
	private String lname;
	private String userName;
	private String mname;
	private String userType;
	private String mobileNo;
	private String emailId;
	private String underId;
	private Integer isActive;
	private Integer isDeleted;
	private String createdBy;
	private Date createdAt;
	private Date updatedAt;
	private String updatedBy;
	private String locationAllow;
	private String passwordChangeFlag;
	public User() {
		super();
	}
	public User(Integer id, String fname, String lname, String userName, String mname, String userType, String mobileNo,
			String emailId, String underId, Integer isActive, Integer isDeleted, String createdBy, Date createdAt,
			Date updatedAt, String updatedBy, String locationAllow, String passwordChangeFlag) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.userName = userName;
		this.mname = mname;
		this.userType = userType;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.underId = underId;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.locationAllow = locationAllow;
		this.passwordChangeFlag = passwordChangeFlag;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUnderId() {
		return underId;
	}
	public void setUnderId(String underId) {
		this.underId = underId;
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
	public String getLocationAllow() {
		return locationAllow;
	}
	public void setLocationAllow(String locationAllow) {
		this.locationAllow = locationAllow;
	}
	public String getPasswordChangeFlag() {
		return passwordChangeFlag;
	}
	public void setPasswordChangeFlag(String passwordChangeFlag) {
		this.passwordChangeFlag = passwordChangeFlag;
	}
	

}
