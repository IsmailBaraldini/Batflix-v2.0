package com.example.Batflix.v20.controllers;

import com.example.Batflix.v20.models.Movie;
import com.example.Batflix.v20.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;


    @GetMapping("/")
    public String movies(Model model) {
        model.addAttribute("movies", movieService.listMovies());
        return "movies";
    }

    @GetMapping("/movie/{id}")
    public String movieInfo(@PathVariable Long id, Model model) {
        model.addAttribute("movie", movieService.getMovieById(id));
        return "movie-info";
    }

    @PostMapping("/movie/add")
    public String addNewMovie(Movie movie) {
        movieService.saveMovie(movie);
        return "redirect:/";
    }

    @PostMapping("/movie/delete/{id}")
    public String deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return "redirect:/";
    }
}
