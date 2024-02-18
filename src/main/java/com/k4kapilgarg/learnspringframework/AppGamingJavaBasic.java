package com.k4kapilgarg.learnspringframework;

import com.k4kapilgarg.learnspringframework.Game.GameRunner;
import com.k4kapilgarg.learnspringframework.Game.Mario;

public class AppGamingJavaBasic {
    public static void main(String[] args) {
        Mario game = new Mario();
        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
