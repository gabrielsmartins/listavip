package br.com.listavip.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"br.com.listavip.controller","br.com.listavip.configuration"})
@EntityScan("br.com.listavip.entity")
@EnableJpaRepositories("br.com.listavip.repository")
public class Application extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringApplicationBuilder.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
}
