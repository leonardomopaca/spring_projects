package com.practicing.springpracticing;

import com.practicing.springpracticing.dependencytheoric.GameRunner;
import com.practicing.springpracticing.dependencytheoric.GamingConsole;
import com.practicing.springpracticing.dependencytheoric.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

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
        //If I have more than one Bean related to this class, it returns an error
        //To resolve, one of them should be @Primary
        System.out.println(context.getBean(Address.class));

        //Showing all the Spring Beans using function programming and
        //method reference ::
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
