package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.TrainContentMapper;
import com.po.FitnessUser;
import com.po.TrainContent;
import com.po.TrainContentExample;

@Service
public class IndexService {

	@Autowired
	TrainContentMapper trainContentMapper;
	
	public List<TrainContent> index(FitnessUser fitnessUser) {
		TrainContentExample example = new TrainContentExample();
		example.createCriteria().andUseridEqualTo(fitnessUser.getUserid());
		List<TrainContent> trainDates = trainContentMapper.selectByExample(example);
		
		System.out.println(trainDates);
		
		return trainDates;
	}
	
}
