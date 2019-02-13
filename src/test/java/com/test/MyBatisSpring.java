package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mapper.FitnessUserMapper;
import com.service.FitnessUserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MyBatisSpring {
	
	@Autowired
	private FitnessUserService fitnessUserService;
	
	@Test
	public void myBatisSpring() {
		
		fitnessUserService.test();
	}
}