package com.online.examination.subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class SubjectServices {
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	public List<Subject> getAllSubject(){
		
		List<Subject> subjects = new ArrayList();
		subjectRepository.findAll()
			.forEach(subjects::add);
		return subjects;
	}
	
	public Optional<Subject> getSubject(Integer id) {
		return subjectRepository.findById(id);
	}
	
	public void addSubject(Subject subject) {
		subjectRepository.save(subject);
	}
	
	public void updateSubject(Subject subject,Integer id) {
		subjectRepository.save(subject);
	}
	
	public void deleteSubject(Subject subject,Integer id) {
		subjectRepository.save(subject);
	}
}
