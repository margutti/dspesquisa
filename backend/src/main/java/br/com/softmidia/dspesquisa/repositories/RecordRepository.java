package br.com.softmidia.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.softmidia.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
