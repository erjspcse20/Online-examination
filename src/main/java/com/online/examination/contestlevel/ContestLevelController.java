package com.online.examination.contestlevel;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="contestLevel/api")
public class ContestLevelController {
	@Autowired
	private ContestLevelService contestLevelServices;
	
	@RequestMapping(value="/allContestLevel")
	public List<ContestLevel> getAllContestLevel()
	{
		return contestLevelServices.getAllContestLevel();
	}
	
	@RequestMapping(value="/getContestLevel/{id}")
	public Optional<ContestLevel> getContestLevel(@PathVariable Integer id)
	{
		return contestLevelServices.getContestLevel(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addContestLevel")
	public void addContest(@RequestBody ContestLevel contestLevel)
	{
		contestLevelServices.addContestLevel(contestLevel);
	}

	@RequestMapping(value="/updateContestLevel/{id}")
	public void updateContest(@RequestBody ContestLevel contestLevel,@PathVariable Integer id)
	{
		contestLevelServices.updateContestLevel(contestLevel, id);
	}

	@RequestMapping(value="/deleteContestLevel/{id}")
	public void deleteContest(@RequestBody ContestLevel contestLevel,@PathVariable Integer id)
	{
		contestLevelServices.deleteContestLevel(contestLevel, id);
	}
}