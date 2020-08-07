package com.java.brain.microservice.ratingdataservice;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.brain.microservice.ratingdataservice.model.Rating;
import com.java.brain.microservice.ratingdataservice.model.UserRating;

@RestController
@RequestMapping("/ratingdata")
public class RatingResources {

	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, 4);
	}

	@RequestMapping("/user/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		List<Rating> ratings = Arrays.asList(new Rating("123342", 2), new Rating("54453", 3), new Rating("34343", 4),
				new Rating("4324343", 5));
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
	}

}
