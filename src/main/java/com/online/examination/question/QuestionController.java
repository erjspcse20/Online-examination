package com.online.examination.question;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="ques/api")
public class QuestionController {
	
	@Autowired
	private QuestionServices questionServices;
	
	@RequestMapping(value="/AllQuestion")
	public List<Question> getAllQuestion(){
		return questionServices.getAllQuestion();
	}
	
	@RequestMapping(value="/question/{id}")
	public Optional<Question> getQuestion(@PathVariable Integer id) {
		return questionServices.getQuestion(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addQuestion")
	public void addQuestion(@RequestBody Question question) {
		questionServices.addQuestion(question);
	}

	@RequestMapping(method=RequestMethod.POST,value="/updateQuestion/{id}")
	public void updateQuestion(@RequestBody Question question,@PathVariable Integer id) {
		questionServices.updateQuestion(question, id);
	}

	@RequestMapping(method=RequestMethod.POST,value="/deleteQuestion/{id}")
	public void deleteQuestion(@RequestBody Question question,@PathVariable Integer id) {
		questionServices.deleteQuestion(question, id);
	}
}
