package com.k4kapilgarg.learnspringframework;

import com.k4kapilgarg.learnspringframework.Game.GameRunner;
import com.k4kapilgarg.learnspringframework.Game.GamingConsole;
import com.k4kapilgarg.learnspringframework.Game.SuperContra;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpring {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GameSpringContext.class)) {
            context.getBean(GamingConsole.class).Up();
            context.getBean(GameRunner.class).run();
        }
    }
}
