package com.practicing.springpracticing.repository;

import com.practicing.springpracticing.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JdbcCommandRunner implements CommandLineRunner {
    @Autowired
    CourseRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insertCourse(new Course(4, "MongoDB", "Jack Andrews"));
        repository.insertCourse(new Course(5, "H2", "Jack Andrews"));
        repository.deleteCourse(1);

        System.out.println(repository.findById(2));
    }
}
