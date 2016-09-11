package com.crk;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crk.demo3.service.IAccountService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class TestDemo3 {
	
	@Resource
	private IAccountService accountService;
	
	@Test
	public void test(){
		accountService.transfer("aaa", "bbb", 200d);
	}

}
