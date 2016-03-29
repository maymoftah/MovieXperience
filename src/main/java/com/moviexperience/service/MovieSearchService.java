package com.moviexperience.service;


import com.moviexperience.model.Movie;


import java.util.List;

public interface MovieSearchService {
    public List getAllMovie();
    public Movie getMovie (String title);

}
