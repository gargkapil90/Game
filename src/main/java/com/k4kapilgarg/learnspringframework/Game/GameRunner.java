package com.k4kapilgarg.learnspringframework.Game;

public class GameRunner {
    GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run(){
            game.Up();
            game.Down();
            game.Left();
            game.Right();
    }
}
