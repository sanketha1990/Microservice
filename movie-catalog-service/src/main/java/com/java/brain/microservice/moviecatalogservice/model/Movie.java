package com.java.brain.microservice.moviecatalogservice.model;

public class Movie {

	private String movieId;
	private String movieName;
	
	public Movie() {
		System.out.println("Empty Constructor");
	}
	public Movie(String movieId, String movieName) {
		this.movieId = movieId;
		this.movieName = movieName;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + "]";
	}

}
