package springcloud.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootMovieProducerApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMovieProducerApplication.class, args);
	}
}
