package com.github.microprograms.spring_cloud_starter_netflix_zuul_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.util.SocketUtils;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudStarterNetflixZuulDemoApplication {

	@Bean
	public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer() {
		return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
			// 定制嵌入式的servlet容器相关规则
			@Override
			public void customize(ConfigurableWebServerFactory factory) {
				int port = SocketUtils.findAvailableTcpPort(1024, 9999);
				factory.setPort(port);
				System.getProperties().put("server.port", port);
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStarterNetflixZuulDemoApplication.class, args);
	}

}
