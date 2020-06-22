package com.twschool.practice.domain;


public class User {
    private String userId;
    private GuessNumberGame guessNumberGame;
    private int correctCount;
    private int UserScore;

    public User(String userId, GuessNumberGame guessNumberGame, int correctCount,int score) {
        this.userId = userId;
        this.guessNumberGame = guessNumberGame;
        this.correctCount = correctCount;
        this.UserScore = UserScore;
    }


    public GuessNumberGame getGuessNumberGame() {

        return guessNumberGame;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setGuessNumberGame(GuessNumberGame guessNumberGame) {
        this.guessNumberGame = guessNumberGame;
    }

    public int getCorrectCount() {
        return correctCount;
    }

    public void setCorrectCount(int correctCount) {
        this.correctCount = correctCount;
    }

    public int getUserScore() {
        return UserScore;
    }

    public void setUserScore(int userScore) {
        UserScore = userScore;
    }

    public void setUpCorrectCount(){//初始化次数
        this.correctCount = 0;
    }
    public void addWinCorrectCount(){//次数递增
        this.correctCount++;
    }
    public void addUserScore(int userScore){
        this.UserScore +=userScore;
    }


}