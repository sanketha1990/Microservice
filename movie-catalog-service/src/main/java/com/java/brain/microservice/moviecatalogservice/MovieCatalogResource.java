package com.java.brain.microservice.moviecatalogservice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.java.brain.microservice.moviecatalogservice.model.CatalogItem;
import com.java.brain.microservice.moviecatalogservice.model.Movie;
import com.java.brain.microservice.moviecatalogservice.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	WebClient.Builder webClientBuilder;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalogItem(@PathVariable("userId") String userId) {

		// Movie movie = restTemplate.getForObject("http://localhost:8082/movie/foo",
		// Movie.class);

		// Get all the rated movieIds

		

		// put them all together
		//List<Rating> ratings = Arrays.asList(new Rating("123342", 2), new Rating("54453", 3), new Rating("34343", 4),new Rating("4324343", 5));

		UserRating userRatings = restTemplate.getForObject("http://localhost:8083/ratingdata/user/"+userId,UserRating.class);
//		return ratings.stream().map(rating ->{
//			Movie movie=restTemplate.getForObject("http://localhost:8082/movie/"+movie.getMovieId(), Movie.class);			
//		,new CatalogItem(movie.getN,"Transformer des",4))mov;
//		}

		return (List<CatalogItem>) userRatings.getUserRating().stream().map(rat -> {
			// Movie mov = restTemplate.getForObject("http://localhost:8082/movie/" +
			// movie.getMovieId(), Movie.class);
			
			// For each movieId call movie info service and get details
			Movie mov = webClientBuilder.build().get().uri("http://localhost:8082/movie/" + rat.getMovieId()).retrieve()
					.bodyToMono(Movie.class).block();

			return new CatalogItem(mov.getMovieName(), "Des", rat.getRating());
		}).collect(Collectors.toList());

		// return ratings.stream().map(rating->new
		// CatalogItem("Transformer","Transformer des",4)).collect(Collectors.toList());
	}

}
