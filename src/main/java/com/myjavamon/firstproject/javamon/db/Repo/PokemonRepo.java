package com.myjavamon.firstproject.javamon.db.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myjavamon.firstproject.javamon.db.Entity.Pokemon;

@Repository
public interface PokemonRepo extends JpaRepository<Pokemon, Long> {

}
