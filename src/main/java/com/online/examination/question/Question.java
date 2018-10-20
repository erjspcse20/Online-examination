package com.online.examination.question;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	private Integer Id;
	private String questionText;
	private String answerOption1;
	private String answerOption2;
	private String answerOption3;
	private String answerOption4;
	private String masterId;
	private String AnswerText;
	private Integer questionType;
	private Integer isDeleted;
	private Integer isActive;
	private Integer isApproved;
	private String createdBy;
	private String updatedBy;
	private Integer pragraphId;
	public Question() {
		super();
	}
	public Question(Integer id, String questionText, String answerOption1, String answerOption2, String answerOption3,
			String answerOption4, String answerText, Integer questionType, Integer isDeleted, Integer isActive,
			Integer isApproved, String createdBy, String updatedBy, String masterId, Integer pragraphId) {
		super();
		Id = id;
		this.questionText = questionText;
		this.answerOption1 = answerOption1;
		this.answerOption2 = answerOption2;
		this.answerOption3 = answerOption3;
		this.answerOption4 = answerOption4;
		AnswerText = answerText;
		this.questionType = questionType;
		this.isDeleted = isDeleted;
		this.isActive = isActive;
		this.isApproved = isApproved;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.pragraphId = pragraphId;
		this.masterId = masterId;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	public String getAnswerOption1() {
		return answerOption1;
	}
	public void setAnswerOption1(String answerOption1) {
		this.answerOption1 = answerOption1;
	}
	public String getAnswerOption2() {
		return answerOption2;
	}
	public void setAnswerOption2(String answerOption2) {
		this.answerOption2 = answerOption2;
	}
	public String getAnswerOption3() {
		return answerOption3;
	}
	public void setAnswerOption3(String answerOption3) {
		this.answerOption3 = answerOption3;
	}
	public String getAnswerOption4() {
		return answerOption4;
	}
	public void setAnswerOption4(String answerOption4) {
		this.answerOption4 = answerOption4;
	}
	public String getAnswerText() {
		return AnswerText;
	}
	public void setAnswerText(String answerText) {
		AnswerText = answerText;
	}
	public Integer getQuestionType() {
		return questionType;
	}
	public void setQuestionType(Integer questionType) {
		this.questionType = questionType;
	}
	public Integer getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Integer getIsActive() {
		return isActive;
	}
	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}
	public Integer getIsApproved() {
		return isApproved;
	}
	public void setIsApproved(Integer isApproved) {
		this.isApproved = isApproved;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Integer getPragraphId() {
		return pragraphId;
	}
	public void setPragraphId(Integer pragraphId) {
		this.pragraphId = pragraphId;
	}
	public String getMasterId() {
		return masterId;
	}
	public void setMasterId(String masterId) {
		this.masterId = masterId;
	}
	
}
