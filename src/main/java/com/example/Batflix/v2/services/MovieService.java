package com.example.Batflix.v2.services;

import com.example.Batflix.v2.models.Movie;
import com.example.Batflix.v2.repositories.MovieRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    public List<Movie> listMovies(String title) {
        if (title != null) return movieRepository.findByTitle(title);
        return movieRepository.findAll();
    }

    public void saveMovie(Movie movie) {
        log.info("Saving new movie", movie);
        movieRepository.save(movie);
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElse(null);
        }
    }

