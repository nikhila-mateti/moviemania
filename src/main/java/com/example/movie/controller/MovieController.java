package com.example.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie.model.Movie;
import com.example.movie.repository.MovieRepository;
import com.example.movie.service.MovieService;
@RestController
public class MovieController {

	@Autowired
    private MovieService movieService;
	
	 @GetMapping("/displayAll")
	 @ResponseBody
	 public List<Movie> readCsv() {
	    return movieService.readCsvFile();
	 }

}
