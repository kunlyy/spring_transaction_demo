package com.crk.demo1.service.impl;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.crk.demo1.dao.IAccoutDao;
import com.crk.demo1.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
	
	private TransactionTemplate transactionTemplate;
	
	private IAccoutDao accountDao;

	public void setAccountDao(IAccoutDao accountDao) {
		this.accountDao = accountDao;
	}


	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	/**
	 * 编程式事务的编写
	 */
	public void transfer(final String out, final String in, final double money) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(
					TransactionStatus paramTransactionStatus) {
				accountDao.outMoney(out, money);
				accountDao.inMoney(in, money);
			}
		});
	}

}
