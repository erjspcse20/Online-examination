package com.online.examination.questionlevel;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="quelevel/api")
public class QuestionLevelController {

	@Autowired
	private QuestionLevelService questionLevelServices;
	
	@RequestMapping(value="/allContest")
	public List<QuestionLevel> getAllContest()
	{
		return questionLevelServices.getAllQuestionLevel();
	}
	
	@RequestMapping(value="/getContest/{id}")
	public Optional<QuestionLevel> getContest(@PathVariable Integer id)
	{
		return questionLevelServices.getQuestionLevel(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addContest")
	public void addContest(@RequestBody QuestionLevel questionLevel)
	{
		questionLevelServices.addQuestionLevel(questionLevel);
	}

	@RequestMapping(value="/updateContest/{id}")
	public void updateContest(@RequestBody QuestionLevel questionLevel,@PathVariable Integer id)
	{
		questionLevelServices.updateQuestionLevel(questionLevel, id);
	}

	@RequestMapping(value="/deleteContest/{id}")
	public void deleteContest(@RequestBody QuestionLevel questionLevel,@PathVariable Integer id)
	{
		questionLevelServices.deleteQuestionLevel(questionLevel, id);
	}
}
