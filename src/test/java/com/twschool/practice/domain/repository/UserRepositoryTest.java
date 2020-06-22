package com.twschool.practice.domain.repository;

import com.twschool.practice.domain.AnswerGenerator;
import com.twschool.practice.domain.GuessNumberGame;

import com.twschool.practice.domain.User;
import com.twschool.practice.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;


public class UserRepositoryTest {
    @Test
    public void should_return_userInfo() {
        // given
        User userInfo = new User("lmy",new GuessNumberGame(new AnswerGenerator()),0,0);
        UserRepository userRepository = new UserRepository();

        // when
        userRepository.setUserInfo("lmy",userInfo);

        //then
        User result = userRepository.getUserInfoById("lmy");
        Assert.assertNotNull(result);
        Assert.assertEquals(0,result.getUserScore());

    }

}