package springcloud.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import springcloud.netflix.filters.ErrorFilter;
import springcloud.netflix.filters.PostFilter;
import springcloud.netflix.filters.PreFilter;
import springcloud.netflix.filters.RouteFilter;


@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class SpringBootZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
