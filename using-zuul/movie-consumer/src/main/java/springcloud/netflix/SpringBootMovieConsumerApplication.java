package springcloud.netflix;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import springcloud.netflix.controllers.MovieConsumerController;

@SpringBootApplication
public class SpringBootMovieConsumerApplication {
	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx = SpringApplication.run(
				SpringBootMovieConsumerApplication.class, args);
		
		MovieConsumerController movieConsController=ctx.getBean(MovieConsumerController.class);
		System.out.println(movieConsController);
		movieConsController.getMovie();
		
	}
	
	@Bean
	public  MovieConsumerController  movieConsController()
	{
		return  new MovieConsumerController();
	}
}
