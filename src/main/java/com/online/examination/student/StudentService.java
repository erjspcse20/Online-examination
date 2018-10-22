package com.online.examination.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudent()
	{
		List<Student> students = new ArrayList();
		studentRepository.findAll()
			.forEach(students::add);
		return students;
	}
	
	public Optional<Student> getStudent(Integer id)
	{
		return studentRepository.findById(id);
	}
	
	public void addStudent(Student franchisee)
	{
		studentRepository.save(franchisee);
	}
	
	public void updateStudent(Student franchisee,Integer id)
	{
		studentRepository.save(franchisee);
	}
	
	public void deleteStudent(Student franchisee,Integer id)
	{
		studentRepository.save(franchisee);
	}
}
