package com.practicing.springpracticing;

import com.practicing.springpracticing.dependencytheoric.GameRunner;
import com.practicing.springpracticing.dependencytheoric.GamingConsole;
import com.practicing.springpracticing.dependencytheoric.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasicJava {
    public static void main(String[] args) {
//        GamingConsole game = new MarioGame();
//        var gameRunner = new GameRunner(game);
//        gameRunner.run();
        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("personMethodCall"));
        System.out.println(context.getBean("personComplete"));
        System.out.println(context.getBean("personWithParameters"));
        System.out.println(context.getBean("location"));
        System.out.println(context.getBean(Address.class));
    }
}
