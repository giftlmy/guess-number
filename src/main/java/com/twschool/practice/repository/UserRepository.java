package com.twschool.practice.repository;

import com.twschool.practice.domain.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<String, User> userRepositoryMap = new HashMap<>();

    public User getUserInfoById(String userId) {
        return userRepositoryMap.get(userId);

    }

    public void setUserInfo(String userId, User user) {
        userRepositoryMap.put(userId, user);

    }


}
