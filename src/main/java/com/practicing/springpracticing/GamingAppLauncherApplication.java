package com.practicing.springpracticing;

import com.practicing.springpracticing.dependencytheoric.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.practicing.springpracticing.dependencytheoric")
public class GamingAppLauncherApplication {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
            context.getBean(GameRunner.class).run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
