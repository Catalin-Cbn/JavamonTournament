package com.myjavamon.firstproject.javamon.db.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myjavamon.firstproject.javamon.db.Entity.Pokemon;
import com.myjavamon.firstproject.javamon.db.Repo.PokemonRepo;
import com.opencsv.CSVReader;

@Service
public class PokemonService {

    @Autowired
    PokemonRepo pokemonRepo;

    public List<Pokemon> findAll() {

        return pokemonRepo.findAll();
    }

    public void save(Pokemon pokemon) {

        pokemonRepo.save(pokemon);
    }

    public Pokemon findbyId(Long id) {

        return pokemonRepo.findById(id).orElse(null);
    }

    public void loadPokemonDataFromCSV() {
        String filePath = "src\\main\\resources\\Lista Pokemon prima generazione.txt";
        List<Pokemon> pokemonList = new ArrayList<>();
        
        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            String[] nextRecord;
            
            while ((nextRecord = csvReader.readNext()) != null) {
                try {
                    Long id = Long.parseLong(nextRecord[0]);
                    String nome = nextRecord[1];
                    String tipo = nextRecord[2];
                    int hp = Integer.parseInt(nextRecord[3]);
                    int attack = Integer.parseInt(nextRecord[4]);
                    int defense = Integer.parseInt(nextRecord[5]);
                    int speed = Integer.parseInt(nextRecord[6]);

                    
                    Pokemon pokemon = new Pokemon(id, nome, tipo, hp, attack, defense, speed);
                    pokemonList.add(pokemon);

                } catch (NumberFormatException e) {
                    System.out.println("Errore nel parsing dei dati per la riga: " + String.join(",", nextRecord));
                    e.printStackTrace();
                }
            }

            // Salva tutti i Pokémon nel database
            if (!pokemonList.isEmpty()) {
                pokemonRepo.saveAll(pokemonList);
            }
            

        } catch (IOException e) {
            System.out.println("Errore nella lettura del file CSV: " + filePath);
            e.printStackTrace();
        }
    }
}
