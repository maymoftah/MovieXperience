package com.moviexperience.config;
import com.moviexperience.service.MovieSearchService;
import com.moviexperience.service.MovieSearchServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import static com.moviexperience.constants.ConstantConfigs.*;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Bean;


@Configuration
@ComponentScan(basePackages = {PACKAGE_MODEL})
@Import(JPAConfigs.class)
public class RootConfigs {

    @Bean
    public MovieSearchService searchService () {
        return new MovieSearchServiceImpl();
    }
}
