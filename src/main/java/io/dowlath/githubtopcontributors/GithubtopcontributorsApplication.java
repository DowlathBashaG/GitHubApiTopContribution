package io.dowlath.githubtopcontributors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GithubtopcontributorsApplication {

	@Autowired
	private RestTemplate template;


	public static void main(String[] args) {
		SpringApplication.run(GithubtopcontributorsApplication.class, args);
	}

	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
}
