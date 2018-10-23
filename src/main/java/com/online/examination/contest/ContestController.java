package com.online.examination.contest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="contest/api")
public class ContestController {
	@Autowired
	private ContestService contestServices;
	
	@RequestMapping(value="/allContest")
	public List<Contest> getAllContest()
	{
		return contestServices.getAllContest();
	}
	
	@RequestMapping(value="/getContest/{id}")
	public Optional<Contest> getContest(@PathVariable Integer id)
	{
		return contestServices.getContest(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addContest")
	public void addContest(@RequestBody Contest contest)
	{
		contestServices.addContest(contest);
	}

	@RequestMapping(value="/updateContest/{id}")
	public void updateContest(@RequestBody Contest contest,@PathVariable Integer id)
	{
		contestServices.updateContest(contest, id);
	}

	@RequestMapping(value="/deleteContest/{id}")
	public void deleteContest(@RequestBody Contest contest,@PathVariable Integer id)
	{
		contestServices.deleteContest(contest, id);
	}
}
