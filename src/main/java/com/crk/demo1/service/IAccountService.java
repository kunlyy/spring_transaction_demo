package com.crk.demo1.service;

public interface IAccountService {
	
	/**
	 * 转账
	 * @param out	：转出账户
	 * @param in	：转入账户
	 * @param meney	：金额
	 */
	public void transfer(String out,String in,double money);

}
