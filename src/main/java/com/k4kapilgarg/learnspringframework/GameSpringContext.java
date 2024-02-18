package com.k4kapilgarg.learnspringframework;

import com.k4kapilgarg.learnspringframework.Game.GameRunner;
import com.k4kapilgarg.learnspringframework.Game.GamingConsole;
import com.k4kapilgarg.learnspringframework.Game.Mario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameSpringContext {

    @Bean
    public GamingConsole game(){
        return new Mario();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        return new GameRunner(game);
    }
}
