package com.movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.movie.model.Login;

public class LoginDAO {

private SqlSessionFactory sqlSessionFactory; 
	
	public LoginDAO(){
		sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
	}
	


/**
 * Returns the list of all Contact instances from the database.
 * @return the list of all Contact instances from the database.
 */
@SuppressWarnings("unchecked")

	public Login selectLogin(Login login){

		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			login = (Login)session.selectOne("Login.getAll",login);
			return login;
		} finally {
			session.close();
		}
	}
}