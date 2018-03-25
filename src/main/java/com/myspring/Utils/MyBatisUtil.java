package com.myspring.Utils;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	public static SqlSessionFactory getSqlSessionFactory(){
		InputStream config = MyBatisUtil.class.getClassLoader().getResourceAsStream("MyBatisCfg.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(config);
		return factory;	
	}
	
	//获取session
	public static SqlSession getSession(){
		return getSqlSessionFactory().openSession(true);
	}
	
	//获取session，如果参数为false则需要rollback。
	public static SqlSession getSession(boolean isAutoCommit){
		return getSqlSessionFactory().openSession(isAutoCommit);
	}
}
