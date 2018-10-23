package com.online.examination.questionlevel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionLevelService {

	@Autowired
	private QuestionLevelRepository questionLevelRepository;
	
	public List<QuestionLevel> getAllQuestionLevel()
	{
		List<QuestionLevel> questionLevels = new ArrayList();
		questionLevelRepository.findAll()
			.forEach(questionLevels::add);
		return questionLevels;
	}
	
	public Optional<QuestionLevel> getQuestionLevel(Integer id)
	{
		return questionLevelRepository.findById(id);
	}
	
	public void addQuestionLevel(QuestionLevel questionLevel)
	{
		questionLevelRepository.save(questionLevel);
	}
	
	public void updateQuestionLevel(QuestionLevel questionLevel,Integer id)
	{
		questionLevelRepository.save(questionLevel);
	}
	
	public void deleteQuestionLevel(QuestionLevel questionLevel,Integer id)
	{
		questionLevelRepository.save(questionLevel);
	}
}
