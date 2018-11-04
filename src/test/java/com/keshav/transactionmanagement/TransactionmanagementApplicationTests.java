package com.keshav.transactionmanagement;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.keshav.transactionmanagement.service.BankAccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionmanagementApplicationTests {
	
	@Autowired
	BankAccountService bs;
	
	
	@Test
	public void testTransfer() {
		bs.transfer(500);
	}

}
