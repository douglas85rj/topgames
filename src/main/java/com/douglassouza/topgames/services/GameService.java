package com.douglassouza.topgames.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douglassouza.topgames.dto.GameMinDTO;
import com.douglassouza.topgames.entities.Game;
import com.douglassouza.topgames.repositories.GameRepository;

@Service
public class GameService {
    @Autowired
    private GameRepository  gameRepository;

    public List<GameMinDTO> findAll() {

      List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
        
        
    }

}
