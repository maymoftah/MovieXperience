package com.moviexperience.dao;
import java.io.Serializable;
import java.util.List;

import com.moviexperience.model.Movie;
/** Movie Data Access Object Interface**/
public interface MovieDao {
    public List getAllMovie();
    public Movie getMovie (String title);

}
