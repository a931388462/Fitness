package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mapper.FitnessUserMapper;
import com.po.FitnessUser;

public class MyBatisSpring {
	public static void main(String[] args) {
		//��ʼ������
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //���bean
        FitnessUserMapper fitnessUserMapper = ctx.getBean(FitnessUserMapper.class);
        //�������ݿ�
        FitnessUser fitnessUser = fitnessUserMapper.selectByPrimaryKey(1);
        System.out.println(fitnessUser);
	}
}
