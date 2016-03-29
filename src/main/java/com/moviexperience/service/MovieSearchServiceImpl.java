package com.moviexperience.service;

import com.moviexperience.model.Movie;
import com.moviexperience.dao.MovieDao;
import com.moviexperience.repo.MovieRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MovieSearchServiceImpl implements MovieSearchService {

    @Autowired
    private MovieDao movieDao;

    @Transactional
    public Movie getMovie (String title) {
        return movieDao.getMovie(title);
    }

    @Transactional
    public List getAllMovie(){
        return movieDao.getAllMovie();
    }


}
