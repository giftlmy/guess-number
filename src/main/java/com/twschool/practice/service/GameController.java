package com.twschool.practice.service;

import com.twschool.practice.domain.GameStatus;
import com.twschool.practice.domain.GuessNumberGame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
public class GameController {

   @PostMapping("/game/guess-numbers")
   public Map<String,String> guess(@RequestBody Map<String,String> requestBody){
       Map<String,String> responseBody = new HashMap<>();
       responseBody.put("input",requestBody.get("number"));
       responseBody.put("result","4A0B");
       return responseBody;
   }

    @GetMapping("/history")
    public Map<String, String> history() {
        Map<String, String> map = new HashMap<>();
        map.put("result", "Input:1 2 3 4    Output:4A0B");
        return map;
    }
}