package com.douglassouza.topgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglassouza.topgames.entities.Game;

public interface GameRepository extends JpaRepository <Game, Long> {



}
