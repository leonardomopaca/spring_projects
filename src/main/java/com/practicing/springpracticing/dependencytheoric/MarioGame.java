package com.practicing.springpracticing.dependencytheoric;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{

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
