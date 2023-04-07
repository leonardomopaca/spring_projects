package com.practicing.springpracticing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){};
record PersonComplete(String name, int age, Address address){};
record Address(String firstLine, String city){};

@Configuration
public class GamingConfiguration {
    @Bean
    public String name(){
        return "John";
    }
    @Bean
    public int age(){
        return 30;
    }
    @Bean
    public Person person(){
        return(new Person("Paul", 32));
    }
    @Bean(name = "location")
    public Address address(){
        return new Address("123 First St", "Springfield");
    }
    @Bean
    public Person personMethodCall(){
        return new Person(name(), age());
    }
    @Bean
    public PersonComplete personComplete(){
        return new PersonComplete(name(), age(), address());
    }
    @Bean
    public PersonComplete personWithParameters(String name, int age, Address location){
        return new PersonComplete(name, age, location);
    }
}
