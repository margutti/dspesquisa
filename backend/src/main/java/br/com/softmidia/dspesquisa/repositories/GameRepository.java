package br.com.softmidia.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.softmidia.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
