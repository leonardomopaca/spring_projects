package com.practicing.springpracticing.dependencytheoric;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
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
