package com.crk.demo2.service.impl;

import com.crk.demo2.dao.IAccoutDao;
import com.crk.demo2.service.IAccountService;

public class AccountServiceImpl implements IAccountService {

	private IAccoutDao accountDao;

	public void setAccountDao(IAccoutDao accountDao) {
		this.accountDao = accountDao;
	}

	/**
	 * 编程式事务的编写
	 */
	public void transfer(final String out, final String in, final double money) {
		accountDao.outMoney(out, money);
		int i = 1/0;
		accountDao.inMoney(in, money);
	}

}
