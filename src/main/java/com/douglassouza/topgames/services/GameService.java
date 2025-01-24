package com.douglassouza.topgames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douglassouza.topgames.dto.GameDTO;
import com.douglassouza.topgames.dto.GameMinDTO;
import com.douglassouza.topgames.entities.Game;
import com.douglassouza.topgames.repositories.GameRepository;

import org.springframework.transaction.annotation.Transactional;

@Service
public class GameService {
  @Autowired
  private GameRepository gameRepository;

  @Transactional(readOnly = true)
  public GameDTO findById(Long id) {
    Game result = gameRepository.findById(id).get();
    return new GameDTO(result);

  }

  public List<GameMinDTO> findAll() {

    List<Game> result = gameRepository.findAll();
    return result.stream().map(x -> new GameMinDTO(x)).toList();

  }

}
