package com.twschool.practice.controller;

import com.twschool.practice.domain.GameStatus;
import com.twschool.practice.domain.GuessNumberGame;

import com.twschool.practice.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class GameController {
    private GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping("/game/guess-numbers")
   public Map<String,String> guess(@RequestBody Map<String,String> requestBody){
        String number = requestBody.get("number");
       Map<String,String> responseBody = new HashMap<>();
       responseBody.put("input",number);
       responseBody.put("result",gameService.guess(number));
       return responseBody;
   }



}