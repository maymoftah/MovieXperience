package com.moviexperience.dao;
import com.moviexperience.model.Movie;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**MovieDao implementable, implements movidao interface to access data and return desired values**/
@Repository
public class MovieDaoImpl implements MovieDao {
    @Autowired
    private SessionFactory session;

    private Session getCurrentSession() {
        return session.getCurrentSession();
    }

    @Override
    public Movie getMovie (String title) {
        return (Movie)session.getCurrentSession().get(Movie.class, title);
    }

    @SuppressWarnings("unchecked")
    public List getAllMovie() {
        return getCurrentSession().createQuery("from Movie").list();
    }







}
