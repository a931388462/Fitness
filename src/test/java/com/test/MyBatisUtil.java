package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/***
 * 为了更加方便的复用MyBatis实现数据访问不需要频繁的创建SQLSessionFactory和SQLSession对象，封装一个MyBatisUtil工具类
 * 
 * @author FanWeiMeng
 *
 */
public abstract class MyBatisUtil {

	// GC不理static
	private static SqlSessionFactory factory = null;

	/***
	 * @param 配置文件
	 * @return
	 */
	public static SqlSessionFactory getSqlSessionFactory(String fileName) {
		if (factory == null) {
			// 获得环境配置文件流
			//InputStream config = MyBatisUtil.class.getClassLoader().getResourceAsStream(fileName);
			// 创建sql会话工厂
			//factory = new SqlSessionFactoryBuilder().build(config);
			
	        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
	        Reader reader = null;
			try {
				reader = Resources.getResourceAsReader(fileName);
			} catch (IOException e) {
				e.printStackTrace();
			} 
	        //构建sqlSession的工厂
	        factory = new SqlSessionFactoryBuilder().build(reader);
		}
		return factory;
	}

	/***
	 * 获得会话
	 * 
	 * @param 配置文件
	 * @return
	 */
	public static SqlSession getSession(String fileName) {
		return getSqlSessionFactory(fileName).openSession(true);
	}

	/**
	 * 获得得sql会话
	 * 
	 * @param isAutoCommit 是否自动提交，如果为false则需要sqlSession.commit()或.rollback();
	 * @return sql会话
	 */
	public static SqlSession getSession(String fileName, boolean isAutoCommit) {
		return getSqlSessionFactory(fileName).openSession(isAutoCommit);
	}

}