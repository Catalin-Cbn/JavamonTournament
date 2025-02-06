package com.myjavamon.firstproject.javamon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.myjavamon.firstproject.javamon.db.Service.PokemonService;

@SpringBootApplication
public class JavamonApplication implements CommandLineRunner {

	@Autowired
	PokemonService pokemonService;

	public static void main(String[] args) {
		SpringApplication.run(JavamonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

	@Bean
	public CommandLineRunner loadData() {
		return (args) -> {
			pokemonService.loadPokemonDataFromCSV();
		};

	}
}