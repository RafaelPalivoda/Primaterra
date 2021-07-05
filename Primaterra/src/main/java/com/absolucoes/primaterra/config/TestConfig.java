package com.absolucoes.primaterra.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.absolucoes.primaterra.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {

	public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS").allowedOrigins("*");
    }
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public void instanciaBaseDeDados() {
		this.dbService.instanciaBaseDeDados(); 
	}
}
