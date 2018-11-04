package com.keshav.transactionmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.keshav.transactionmanagement.entity.BankAccount;

public interface BankAccountRepository extends CrudRepository<BankAccount, Integer> {

}
