package br.com.softmidia.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.softmidia.dspesquisa.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
