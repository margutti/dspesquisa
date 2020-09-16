package br.com.softmidia.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.softmidia.dspesquisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {

}
