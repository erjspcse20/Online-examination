package com.online.examination.paymentmethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.examination.contest.Contest;
import com.online.examination.contest.ContestRepository;

@Service
public class PaymentMethodService {
	@Autowired
	private PaymentMethodRepository paymentMethodRepository;
	
	public List<PaymentMethod> getAllPaymentMethod()
	{
		List<PaymentMethod> paymentmethods = new ArrayList();
		paymentMethodRepository.findAll()
			.forEach(paymentmethods::add);
		return paymentmethods;
	}	
	public Optional<PaymentMethod> getPaymentMethod(Integer id)
	{
		return paymentMethodRepository.findById(id);
	}
	public void addPaymentMethod(PaymentMethod paymentmethod)
	{
		paymentMethodRepository.save(paymentmethod);
	}
	public void updatePaymentMethod(PaymentMethod paymentmethod,Integer id)
	{
		paymentMethodRepository.save(paymentmethod);
	}
	public void deletePaymentMethod(PaymentMethod paymentmethod,Integer id)
	{
		paymentMethodRepository.save(paymentmethod);
	}

}
