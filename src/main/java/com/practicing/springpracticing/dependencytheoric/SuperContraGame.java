package com.practicing.springpracticing.dependencytheoric;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("superContraQualifier")
public class SuperContraGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("UP");
    }

    @Override
    public void down() {
        System.out.println("SIT DOWN");
    }

    @Override
    public void left() {
        System.out.println("GO BACK");
    }

    @Override
    public void right() {
        System.out.println("SHOOT A BULLET");
    }
}
