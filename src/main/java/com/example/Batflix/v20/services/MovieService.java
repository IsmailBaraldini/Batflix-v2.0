package com.example.Batflix.v20.services;

import com.example.Batflix.v20.models.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    private List<Movie> movies = new ArrayList<>();
    private long ID = 0;

    {
        movies.add(new Movie(++ID, "Spider Man 3", "A strange black entity from another world bonds with Peter Parker and causes inner turmoil as he contends with new villains, temptations, and revenge.", "6.3", "USA", "2007"));
        movies.add(new Movie(++ID, "Harry Potter and the Goblet of Fire", "Harry Potter finds himself competing in a hazardous tournament between rival schools of magic, but he is distracted by recurring nightmares.", "7.7", "USA", "2005"));
    }

    public List<Movie> listMovies() {
        return movies;

    }

    public void saveMovie(Movie movie) {
        movie.setId(++ID);
        movies.add(movie);
    }

    public void deleteMovie(Long id) {
        movies.removeIf(movie -> movie.getId().equals(id));
    }

    public Movie getMovieById(Long id) {
        for (Movie movie : movies) {
            if (movie.getId().equals(id)) return movie ;
        }
        return null;
    }
}

