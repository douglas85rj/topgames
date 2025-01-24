package com.douglassouza.topgames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douglassouza.topgames.dto.GameListDTO;

import com.douglassouza.topgames.entities.GameList;
import com.douglassouza.topgames.repositories.GameListRepository;

@Service
public class GameListService {
  @Autowired
  private GameListRepository gameListRepository;

  public List<GameListDTO> findAll() {

    List<GameList> result = gameListRepository.findAll();
    return result.stream().map(x -> new GameListDTO(x)).toList();

  }

}
