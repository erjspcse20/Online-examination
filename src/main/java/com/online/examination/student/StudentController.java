package com.online.examination.student;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="student/api")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/allStudent")
	public List<Student> getAllStudent()
	{
		return studentService.getAllStudent();
	}
	
	@RequestMapping(value="/getStudent/{id}")
	public Optional<Student> getStudent(@PathVariable Integer id)
	{
		return studentService.getStudent(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addStudent")
	public void addStudent(@RequestBody Student Student)
	{
		studentService.addStudent(Student);
	}

	@RequestMapping(value="/updateStudent/{id}")
	public void updateStudent(@RequestBody Student Student,@PathVariable Integer id)
	{
		studentService.updateStudent(Student, id);
	}

	@RequestMapping(value="/deleteStudent/{id}")
	public void deleteStudent(@RequestBody Student Student,@PathVariable Integer id)
	{
		studentService.deleteStudent(Student, id);
	}
}
