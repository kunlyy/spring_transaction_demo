package com.crk.demo4.dao;


public interface IAccoutDao {
	
	/**
	 * ת��
	 * @param in	��ת���˻�
	 * @param money	��ת����
	 */
	public void inMoney(String in,double money);
	
	/**
	 * ת��
	 * @param out	:ת���˻�
	 * @param money	:ת�����
	 */
	public void outMoney(String out,double money);

}
