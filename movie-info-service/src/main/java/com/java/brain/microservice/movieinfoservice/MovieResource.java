package com.java.brain.microservice.movieinfoservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.brain.microservice.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movie")
public class MovieResource {
	
	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId") String movieId) {
		return new Movie("12323", "Raja Rani");
		
	}

}
