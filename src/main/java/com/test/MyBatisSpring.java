package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mapper.FitnessUserMapper;
import com.po.FitnessUser;

public class MyBatisSpring {
	public static void main(String[] args) {
		//初始化容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //获得bean
        FitnessUserMapper fitnessUserMapper = ctx.getBean(FitnessUserMapper.class);
        //访问数据库
        FitnessUser fitnessUser = fitnessUserMapper.selectByPrimaryKey(1);
        System.out.println(fitnessUser);
	}
}
