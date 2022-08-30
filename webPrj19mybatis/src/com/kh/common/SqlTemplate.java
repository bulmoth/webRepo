package com.kh.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlTemplate {
	
	//getConnection
	//commit
	//rollback
	//close*3
	
	public static SqlSession getSqlSession() {
		
		SqlSession ss = null;
		
		try {
			String resource = "/mybatis-config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
			ss = sqlSessionFactory.openSession(false);
			//openSessioin(boolean flag) : 자동커밋 여부	//기본값 : false
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return ss;
	}

}
