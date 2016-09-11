package com.crk.demo4.service.impl;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.crk.demo4.dao.IAccoutDao;
import com.crk.demo4.service.IAccountService;

/**
*@Transactional中的的属性
*propagation			:事务的传播行为
*isolation				:事务的隔离级别
*readOnly				:只读
*rollbackFor			:发生哪些异常回滚
*noRollbackFor			:发生哪些异常不回滚
*rollbackForClassName 	:根据异常类名回滚
*timeout				:超时时间
*transactionManager		：配置具体的事务管理器
*/
@Transactional(propagation=Propagation.REQUIRED)
public class AccountServiceImpl implements IAccountService {

	private IAccoutDao accountDao;

	public void setAccountDao(IAccoutDao accountDao) {
		this.accountDao = accountDao;
	}

	/**
	 * 事务操作的方法
	 */
	public void transfer(final String out, final String in, final double money) {
		accountDao.outMoney(out, money);
		int i = 1/0;
		accountDao.inMoney(in, money);
	}

}
