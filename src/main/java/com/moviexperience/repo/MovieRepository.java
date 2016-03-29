package com.moviexperience.repo;

import com.moviexperience.model.Movie;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    public List<Movie> findByTitle(@Param("title") String title);
}
