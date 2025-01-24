package com.douglassouza.topgames.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.douglassouza.topgames.dto.GameListDTO;
import com.douglassouza.topgames.services.GameListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    @GetMapping
    public List<GameListDTO> findAll() {

        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

}
