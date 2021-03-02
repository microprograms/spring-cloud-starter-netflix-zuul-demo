package com.github.microprograms.spring_cloud_starter_netflix_zuul_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudStarterNetflixZuulDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStarterNetflixZuulDemoApplication.class, args);
	}

}
