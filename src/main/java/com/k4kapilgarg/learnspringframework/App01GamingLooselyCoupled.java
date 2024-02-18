package com.k4kapilgarg.learnspringframework;

import com.k4kapilgarg.learnspringframework.Game.GameRunner;
import com.k4kapilgarg.learnspringframework.Game.GamingConsole;
import com.k4kapilgarg.learnspringframework.Game.SuperContra;

public class App01GamingLooselyCoupled {
    public static void main(String[] args) {
//        GamingConsole game = new Mario();
        GamingConsole game = new SuperContra();
        GameRunner gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
