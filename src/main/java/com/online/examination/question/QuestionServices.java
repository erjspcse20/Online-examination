package com.online.examination.question;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServices {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	public List<Question> getAllQuestion(){
		List<Question> questions = new ArrayList();
		questionRepository.findAll()
			.forEach(questions::add);
		return questions;
	}
	
	public Optional<Question> getQuestion(Integer id) {
		return questionRepository.findById(id);
	}
	
	public void addQuestion(Question question) {
		questionRepository.save(question);
	}
	
	public void updateQuestion(Question question,Integer id) {
		questionRepository.save(question);
	}
	
	public void deleteQuestion(Question question,Integer id) {
		questionRepository.save(question);
	}

}
