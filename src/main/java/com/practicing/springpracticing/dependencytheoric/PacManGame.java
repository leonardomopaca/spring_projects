package com.practicing.springpracticing.dependencytheoric;

public class PacManGame implements GamingConsole{
    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("Getting into a hole");
    }

    public void left(){
        System.out.println("Go back");
    }

    public void right(){
        System.out.println("Going Forward");
    }
}
