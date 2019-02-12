package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/***
 * Ϊ�˸��ӷ���ĸ���MyBatisʵ�����ݷ��ʲ���ҪƵ���Ĵ���SQLSessionFactory��SQLSession���󣬷�װһ��MyBatisUtil������
 * 
 * @author FanWeiMeng
 *
 */
public abstract class MyBatisUtil {

	// GC����static
	private static SqlSessionFactory factory = null;

	/***
	 * @param �����ļ�
	 * @return
	 */
	public static SqlSessionFactory getSqlSessionFactory(String fileName) {
		if (factory == null) {
			// ��û��������ļ���
			//InputStream config = MyBatisUtil.class.getClassLoader().getResourceAsStream(fileName);
			// ����sql�Ự����
			//factory = new SqlSessionFactoryBuilder().build(config);
			
	        //ʹ��MyBatis�ṩ��Resources�����mybatis�������ļ�����Ҳ���ع�����ӳ���ļ���
	        Reader reader = null;
			try {
				reader = Resources.getResourceAsReader(fileName);
			} catch (IOException e) {
				e.printStackTrace();
			} 
	        //����sqlSession�Ĺ���
	        factory = new SqlSessionFactoryBuilder().build(reader);
		}
		return factory;
	}

	/***
	 * ��ûỰ
	 * 
	 * @param �����ļ�
	 * @return
	 */
	public static SqlSession getSession(String fileName) {
		return getSqlSessionFactory(fileName).openSession(true);
	}

	/**
	 * ��õ�sql�Ự
	 * 
	 * @param isAutoCommit �Ƿ��Զ��ύ�����Ϊfalse����ҪsqlSession.commit()��.rollback();
	 * @return sql�Ự
	 */
	public static SqlSession getSession(String fileName, boolean isAutoCommit) {
		return getSqlSessionFactory(fileName).openSession(isAutoCommit);
	}

}