package br.com.yagoananias.mybooks.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.yagoananias.mybooks.service.DBService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService dbService;
	
	@Bean
	public void instanciaBaseDeDados() {
		this.dbService.instanciaBaseDeDados();
	}
	
}
