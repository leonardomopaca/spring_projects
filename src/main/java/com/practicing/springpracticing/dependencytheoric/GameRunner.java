package com.practicing.springpracticing.dependencytheoric;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;

    public GameRunner(@Qualifier("superContraQualifier") GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running the game: " + game);
        game.down();
        game.left();
        game.up();
        game.right();
    }
}
