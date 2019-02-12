package com.test;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mapper.FitnessUserMapper;
import com.po.FitnessUser;

public class MybistConnect  {
	
	public static void main(String[] args) {
		//mybatis�������ļ�
        String fileName = "mybatisConfig.xml";
        SqlSession session = MyBatisUtil.getSession(fileName);
        /**
         * ӳ��sql�ı�ʶ�ַ�����
         * me.gacl.mapping.userMapper��userMapper.xml�ļ���mapper��ǩ��namespace���Ե�ֵ��
         * getUser��select��ǩ��id����ֵ��ͨ��select��ǩ��id����ֵ�Ϳ����ҵ�Ҫִ�е�SQL
         */
        String statement = "com.mapper.FitnessUserMapper.selectByPrimaryKey";//ӳ��sql�ı�ʶ�ַ���
        //ִ�в�ѯ����һ��Ψһuser�����sql
        FitnessUser user = session.selectOne(statement, 1);
        
        System.out.println(user.getUsername());
	}
}
