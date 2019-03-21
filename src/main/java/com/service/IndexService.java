package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.TrainDateMapper;
import com.po.FitnessUser;
import com.po.TrainDate;
import com.po.TrainDateExample;

@Service
public class IndexService {

	@Autowired
	TrainDateMapper trainDateMapper;
	
	public List<TrainDate> index(FitnessUser fitnessUser) {
		TrainDateExample example = new TrainDateExample();
		example.createCriteria().andUseridEqualTo(fitnessUser.getUserid());
		List<TrainDate> trainDates = trainDateMapper.selectByExample(example);
		
		System.out.println(trainDates);
		
		return trainDates;
	}
	
}
