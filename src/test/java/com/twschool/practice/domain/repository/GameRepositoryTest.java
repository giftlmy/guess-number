package com.twschool.practice.domain.repository;

import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.repository.GameRepository;
import org.junit.Test;

public class GameRepositoryTest {
    @Test
    public void should_cerate_game(){
        GameRepository gameRepository = new GameRepository();
        GuessNumberGame expectedGuessNUmberGame = gameRepository.create();
        GuessNumberGame guessNumberGame = gameRepository.find();


    }
}
