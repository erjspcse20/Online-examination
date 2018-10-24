package com.online.examination.wallet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


public class WalletService {

	@Autowired
	private WalletRepository walletRepository;
	
	public List<Wallet> getAllWallet()
	{
		List<Wallet> wallets = new ArrayList();
		walletRepository.findAll()
			.forEach(wallets::add);
		return wallets;
	}
	
	public Optional<Wallet> getWallet(Integer id)
	{
		return walletRepository.findById(id);
	}
	
	public void addWallet(Wallet wallets)
	{
		walletRepository.save(wallets);
	}

}
