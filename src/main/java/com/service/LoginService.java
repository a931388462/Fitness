package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.FitnessUserMapper;
import com.po.FitnessUser;
import com.po.FitnessUserExample;

@Service
public class LoginService {
	
	@Autowired
	FitnessUserMapper fitnessUserMapper;
	
	/***
	 * 
	 */
	public boolean login(FitnessUser fitnessUser) {
		
		
		//FitnessUserExample example = new FitnessUserExample();
		//example.createCriteria().andUsernameEqualTo(fitnessUser.getUsername());
		
		fitnessUserMapper.selectByPrimaryKey(1);
		return false;
	}
	
}
