package com.movieapp.movies.services;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieapp.movies.Movie;
import com.movieapp.movies.repositories.MovieRepository;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
    
    public Optional<Movie> singleMovie(String imdbId) {
    	return movieRepository.findMovieByImdbId(imdbId);  
    }
}
