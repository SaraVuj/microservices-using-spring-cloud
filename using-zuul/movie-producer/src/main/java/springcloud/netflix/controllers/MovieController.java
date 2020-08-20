package springcloud.netflix.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springcloud.netflix.models.Movie;

@RestController
public class MovieController {
	@RequestMapping(value = "/movie", method = RequestMethod.GET)
	public Movie home() {

		Movie movie = new Movie();
		movie.setTitle("V for Vendetta");
		movie.setGenre("Sci-fi");
		movie.setRating(73);
		movie.setRuntime(132);
		movie.setYear(2005);
		movie.setMovieID(1);

		return movie;
	}
}
