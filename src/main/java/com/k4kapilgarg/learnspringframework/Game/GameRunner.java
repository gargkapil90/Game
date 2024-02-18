package com.k4kapilgarg.learnspringframework.Game;

public class GameRunner {
    Mario game;

    public GameRunner(Mario game) {
        this.game = game;
    }

    public void run(){
            game.Up();
            game.Down();
            game.Left();
            game.Right();
    }
}
