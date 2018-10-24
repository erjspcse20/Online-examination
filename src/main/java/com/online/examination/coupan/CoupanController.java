package com.online.examination.coupan;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="coupan/api")
public class CoupanController {
	@Autowired
	private CoupanService coupanServices;
	
	@RequestMapping(value="/allCoupan")
	public List<Coupan> getAllContest()
	{
		return coupanServices.getAllContest();
	}
	
	@RequestMapping(value="/getCoupan/{id}")
	public Optional<Coupan> getContest(@PathVariable Integer id)
	{
		return coupanServices.getContest(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addCoupan")
	public void addContest(@RequestBody Coupan contest)
	{
		coupanServices.addContest(contest);
	}

	@RequestMapping(value="/updateCoupan/{id}")
	public void updateContest(@RequestBody Coupan contest,@PathVariable Integer id)
	{
		coupanServices.updateContest(contest, id);
	}

	@RequestMapping(value="/deleteCoupan/{id}")
	public void deleteContest(@RequestBody Coupan contest,@PathVariable Integer id)
	{
		coupanServices.deleteContest(contest, id);
	}
}
