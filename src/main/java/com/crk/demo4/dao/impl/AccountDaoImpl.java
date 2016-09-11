package com.crk.demo4.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.crk.demo4.dao.IAccoutDao;

/**
 * ʹ�ü̳�JdbcDaoSupport�ķ�ʽ����ȡjdbcTemplate����xml�ļ��У�����ֱ����dataSource������ע��
 * @author  kun
 *
 */
public class AccountDaoImpl extends JdbcDaoSupport implements IAccoutDao {
	
	//private JdbcTemplate jdbcTemplate;

	public void inMoney(String in, double money) {
		String sql = "update account set money = money+? where name=?";
		this.getJdbcTemplate().update(sql,money,in);
		
	}

	public void outMoney(String out, double money) {
		String sql = "update account set money=money - ? where name=?";
		this.getJdbcTemplate().update(sql,money,out);
	}

}
