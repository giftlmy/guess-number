package com.twschool.practice.domain.service;

import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.repository.GameRepository;
import com.twschool.practice.service.GameService;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;

public class GameServiceTest {
    @Test
    public void should_return_result_when_guess_number(){
        GameRepository gameRepository = Mockito.mock(GameRepository.class);
        GuessNumberGame guessNumberGame  = Mockito.mock(GuessNumberGame.class);
        Mockito.when(gameRepository.find()).thenReturn(guessNumberGame);
        GameService gameService = new GameService(gameRepository);
        gameService.guess("1 2 3 4");
        Mockito.verify(gameRepository,Mockito.times(1)).find();
        Mockito.verify(guessNumberGame,Mockito.times(1)).guess(Mockito.any());


    }
}
