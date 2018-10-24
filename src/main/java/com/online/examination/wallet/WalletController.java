package com.online.examination.wallet;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="wallet/api")
public class WalletController {
	@Autowired
	private WalletService walletServices;
	
	@RequestMapping(value="/allwallet")
	public List<Wallet> getAllWallet()
	{
		return walletServices.getAllWallet();
	}
	
	@RequestMapping(value="/getwallet/{id}")
	public Optional<Wallet> getWallet(@PathVariable Integer id)
	{
		return walletServices.getWallet(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addwallet")
	public void addWallet(@RequestBody Wallet wallet)
	{
		walletServices.addWallet(wallet);
	}
}
