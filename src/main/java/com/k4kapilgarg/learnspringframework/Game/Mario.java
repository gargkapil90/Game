package com.k4kapilgarg.learnspringframework.Game;

public class Mario implements GamingConsole{
    public void Up(){
        System.out.println("Jump");
    }

    public void Down(){
        System.out.println("Go into hole");
    }

    public void Left(){
        System.out.println("move left");
    }

    public void Right(){
        System.out.println("Speed accelerate");
    }
}
