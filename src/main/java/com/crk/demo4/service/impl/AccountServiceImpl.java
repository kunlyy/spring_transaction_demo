package com.crk.demo4.service.impl;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.crk.demo4.dao.IAccoutDao;
import com.crk.demo4.service.IAccountService;

/**
*@Transactional�еĵ�����
*propagation			:����Ĵ�����Ϊ
*isolation				:����ĸ��뼶��
*readOnly				:ֻ��
*rollbackFor			:������Щ�쳣�ع�
*noRollbackFor			:������Щ�쳣���ع�
*rollbackForClassName 	:�����쳣�����ع�
*timeout				:��ʱʱ��
*transactionManager		�����þ�������������
*/
@Transactional(propagation=Propagation.REQUIRED)
public class AccountServiceImpl implements IAccountService {

	private IAccoutDao accountDao;

	public void setAccountDao(IAccoutDao accountDao) {
		this.accountDao = accountDao;
	}

	/**
	 * ��������ķ���
	 */
	public void transfer(final String out, final String in, final double money) {
		accountDao.outMoney(out, money);
		int i = 1/0;
		accountDao.inMoney(in, money);
	}

}
