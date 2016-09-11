package com.crk;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crk.demo4.service.IAccountService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class TestDemo4 {
	
	@Resource
	private IAccountService accountService;
	
	@Test
	public void test(){
		accountService.transfer("aaa", "bbb", 200d);
	}

}
