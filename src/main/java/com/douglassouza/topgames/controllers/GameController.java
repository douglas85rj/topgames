package com.douglassouza.topgames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douglassouza.topgames.dto.GameMinDTO;
import com.douglassouza.topgames.entities.Game;
import com.douglassouza.topgames.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    @GetMapping
    public List<GameMinDTO> findAll() {

        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

}
