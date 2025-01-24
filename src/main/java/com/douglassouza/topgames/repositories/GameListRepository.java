package com.douglassouza.topgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglassouza.topgames.entities.GameList;

public interface GameListRepository extends JpaRepository <GameList, Long> {



}
