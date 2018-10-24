package com.online.examination.paymentmethod;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.online.examination.contest.Contest;
import com.online.examination.contest.ContestService;

@RestController
@RequestMapping(value="paymentmethod/api")
public class PaymentMethodController {

	@Autowired
	private PaymentMethodService paymentmethodServices;
	
	@RequestMapping(value="/allContest")
	public List<PaymentMethod> getAllContest()
	{
		return paymentmethodServices.getAllPaymentMethod();
	}
	
	@RequestMapping(value="/getPaymentMethod/{id}")
	public Optional<PaymentMethod> getContest(@PathVariable Integer id)
	{
		return paymentmethodServices.getPaymentMethod(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addContest")
	public void addContest(@RequestBody PaymentMethod paymentmethod)
	{
		paymentmethodServices.addPaymentMethod(paymentmethod);
	}

	@RequestMapping(value="/updateContest/{id}")
	public void updateContest(@RequestBody PaymentMethod paymentmethod,@PathVariable Integer id)
	{
		paymentmethodServices.updatePaymentMethod(paymentmethod, id);
	}

	@RequestMapping(value="/deleteContest/{id}")
	public void deletePaymentMethod(@RequestBody PaymentMethod paymentmethod,@PathVariable Integer id)
	{
		paymentmethodServices.deletePaymentMethod(paymentmethod, id);
	}
}
