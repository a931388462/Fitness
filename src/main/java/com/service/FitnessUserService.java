package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.FitnessUserMapper;

@Service()
public class FitnessUserService {
	
	@Autowired
	FitnessUserMapper fitnessUserMapper;
	
	public void test() {
		System.out.println(fitnessUserMapper.selectByPrimaryKey(1));
	}
	
}
