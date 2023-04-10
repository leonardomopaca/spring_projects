package com.practicing.springpracticing.examples.a0;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class SimpleDepInjectionLaucherApplication {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(SimpleDepInjectionLaucherApplication.class)){
            //context.getBean(GameRunner.class).run();
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
