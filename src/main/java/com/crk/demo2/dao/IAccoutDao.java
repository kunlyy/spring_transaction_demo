package com.crk.demo2.dao;


public interface IAccoutDao {
	
	/**
	 * 转入
	 * @param in	：转入账户
	 * @param money	：转入金额
	 */
	public void inMoney(String in,double money);
	
	/**
	 * 转出
	 * @param out	:转出账户
	 * @param money	:转出金额
	 */
	public void outMoney(String out,double money);

}
