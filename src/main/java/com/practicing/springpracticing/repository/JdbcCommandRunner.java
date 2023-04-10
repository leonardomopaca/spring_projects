package com.practicing.springpracticing.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcCommandRunner implements CommandLineRunner {
    @Autowired
    CourseRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert();
    }
}
