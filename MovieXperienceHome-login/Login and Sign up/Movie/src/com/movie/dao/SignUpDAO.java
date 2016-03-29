package com.movie.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.movie.model.Signup;

/**
 * Member DAO
 * 
 * @author
 */
public class SignUpDAO {
	
	private SqlSessionFactory sqlSessionFactory; 
	
	public SignUpDAO(){
		sqlSessionFactory = MyBatisConnectionFactory.getSqlSessionFactory();
	}
	

	/**
	 * Returns the list of all Contact instances from the database.
	 * @return the list of all Contact instances from the database.
	 */
	@SuppressWarnings("unchecked")
	public List<Signup> selectAll(){

		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			List<Signup> list = session.selectList("Member.getAll");
			return list;
		} finally {
			session.close();
		}
	}

	/**
	 * Returns a Contact instance from the database.
	 * @param id primary key value used for lookup.
	 * @return A Contact instance with a primary key value equals to pk. null if there is no matching row.
	 */
	public Signup selectById(int id){

		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			Signup member = (Signup) session.selectOne("Member.getById",id);
			return member;
		} finally {
			session.close();
		}
	}

	/**
	 * Updates an instance of Contact in the database.
	 * @param contact the instance to be updated.
	 */
	public void update(Signup member){

		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			session.update("Member.update", member);
			session.commit();
		} finally {
			session.close();
		}
	}

	/**
	 * Insert an instance of Contact into the database.
	 * @param contact the instance to be persisted.
	 */
	public void insert(Signup sign){

		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			session.insert("SignUp.insert", sign);
			session.commit();
		} finally {
			session.close();
		}
	}

	/**
	 * Delete an instance of Contact from the database.
	 * @param id primary key value of the instance to be deleted.
	 */
	public void delete(int id){

		SqlSession session = sqlSessionFactory.openSession();
		
		try {
			session.delete("Member.deleteById", id);
			session.commit();
		} finally {
			session.close();
		}
	}
}