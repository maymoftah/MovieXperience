package com.moviexperience.controller;

import com.moviexperience.dao.MovieDao;
import com.moviexperience.dao.MovieDaoImpl;
import com.moviexperience.model.Movie;
import java.util.List;
import com.moviexperience.service.MovieSearchService;
import com.moviexperience.service.MovieSearchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MovieController {

    @Autowired
    private MovieSearchService movieSearchService;

    //map to correct page
    @RequestMapping(value = "/listMovies", method = RequestMethod.GET)
    //create model and view
    public ModelAndView listTourists() {
            List<Movie> list = this.movieSearchService.getAllMovie();
            ModelAndView mv = new ModelAndView("listMourists");
            mv.addObject("list", list);

    return mv;
}

}

