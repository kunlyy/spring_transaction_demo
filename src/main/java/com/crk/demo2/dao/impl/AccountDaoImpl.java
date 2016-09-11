package com.crk.demo2.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.crk.demo2.dao.IAccoutDao;

/**
 * 使用继承JdbcDaoSupport的方式来获取jdbcTemplate。在xml文件中，可以直接用dataSource来进行注入
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
