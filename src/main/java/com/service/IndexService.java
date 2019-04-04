package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.TrainDateMapper;
import com.mapper.TrainTypeMapper;
import com.mapper.WeightUnitMapper;
import com.po.FitnessUser;
import com.po.TrainDate;
import com.po.TrainDateExample;
import com.po.TrainType;
import com.po.TrainTypeExample;
import com.po.WeightUnit;
import com.po.WeightUnitExample;

@Service
public class IndexService {

	@Autowired
	TrainDateMapper trainDateMapper;
	@Autowired
	WeightUnitMapper weightUnitMapper;
	@Autowired
	TrainTypeMapper trainTypeMapper;
	
	public List<TrainDate> getTrainDates(FitnessUser fitnessUser) {
		TrainDateExample example = new TrainDateExample();
		example.createCriteria().andUseridEqualTo(fitnessUser.getUserid());
		List<TrainDate> trainDates = trainDateMapper.selectByExample(example);
		return trainDates;
	}
	
	public List<WeightUnit> getWeightUnits() {
		List<WeightUnit> weightUnits = weightUnitMapper.selectByExample(new WeightUnitExample());
		return weightUnits;
	}
	
	public List<TrainType> getTrainTypes() {
		List<TrainType> trainTypes = trainTypeMapper.selectByExample(new TrainTypeExample());
		return trainTypes;
	}

}