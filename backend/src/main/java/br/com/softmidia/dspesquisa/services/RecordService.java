package br.com.softmidia.dspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.softmidia.dspesquisa.dto.RecordDTO;
import br.com.softmidia.dspesquisa.dto.RecordInsertDTO;
import br.com.softmidia.dspesquisa.entities.Game;
import br.com.softmidia.dspesquisa.entities.Record;
import br.com.softmidia.dspesquisa.repositories.GameRepository;
import br.com.softmidia.dspesquisa.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDTO(entity);
	}
}