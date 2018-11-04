package com.keshav.transactionmanagement.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keshav.transactionmanagement.entity.BankAccount;
import com.keshav.transactionmanagement.repos.BankAccountRepository;
@Service
public class BankAccountServiceImpl implements BankAccountService {
	
	@Autowired
	BankAccountRepository repo;
	
	@Override
	@Transactional
	public void transfer(int amt) {
		
		BankAccount kAccount=repo.findById(1).get();
		BankAccount bAccount=repo.findById(2).get();
		
		kAccount.setBal(kAccount.getBal()-amt);
		repo.save(kAccount);
		
		if(true) {
			throw new RuntimeException();
		}
		
		bAccount.setBal(bAccount.getBal()+amt);
		repo.save(bAccount);

	}

}
