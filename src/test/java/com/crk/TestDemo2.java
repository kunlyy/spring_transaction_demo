package com.crk;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crk.demo2.service.IAccountService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class TestDemo2 {
	
	@Resource(name="accountServiceProxy")
	private IAccountService accountService;
	
	@Test
	public void test(){
		accountService.transfer("aaa", "bbb", 200d);
	}

}
