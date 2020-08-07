package com.java.brain.microservice.ratingdataservice.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class UserRating {

	@Autowired
	private List<Rating> userRating;

	public List<Rating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}

	@Override
	public String toString() {
		return "UserRating [userRating=" + userRating + "]";
	}

}
