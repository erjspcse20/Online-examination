package com.online.examination.student;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private Integer id;
	private String masterId;
	private String franchiseeId;
	private String centreId;
	private String fname;
	private String lname;
	private String userName;
	private String mname;
	private String mobileNo;
	private String emailId;
	private String address1;
	private String address2;
	private String countryId;
	private String stateId;
	private String cityId;
	private String aadhano;
	private String panNo;
	private String accountNo;
	private String bankName;
	private String ifscCode;
	private String bankBranch;
	private String bankAddress;
	private String accountHolderName;
	private Integer isActive;
	private Integer isDeleted;
	private String createdBy;
	private Date createdAt;
	private Date updatedAt;
	private String updatedBy;
	public Student() {
		super();
	}
	public Student(Integer id, String masterId, String franchiseeId, String centreId, String fname, String lname, String userName, String mname,
			String mobileNo, String emailId, String address1, String address2, String countryId, String stateId,
			String cityId, String aadhano, String panNo, String accountNo, String bankName, String ifscCode,
			String bankBranch, String bankAddress, String accountHolderName, Integer isActive, Integer isDeleted,
			String createdBy, Date createdAt, Date updatedAt, String updatedBy) {
		super();
		this.id = id;
		this.masterId = masterId;
		this.fname = fname;
		this.lname = lname;
		this.userName = userName;
		this.mname = mname;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.address1 = address1;
		this.address2 = address2;
		this.countryId = countryId;
		this.stateId = stateId;
		this.cityId = cityId;
		this.aadhano = aadhano;
		this.panNo = panNo;
		this.accountNo = accountNo;
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.bankBranch = bankBranch;
		this.bankAddress = bankAddress;
		this.accountHolderName = accountHolderName;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.updatedBy = updatedBy;
		this.franchiseeId = franchiseeId;
		this.centreId = centreId;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMasterId() {
		return masterId;
	}
	public void setMasterId(String masterId) {
		this.masterId = masterId;
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
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getStateId() {
		return stateId;
	}
	public void setStateId(String stateId) {
		this.stateId = stateId;
	}
	public String getCityId() {
		return cityId;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public String getAadhano() {
		return aadhano;
	}
	public void setAadhano(String aadhano) {
		this.aadhano = aadhano;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getBankBranch() {
		return bankBranch;
	}
	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
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
