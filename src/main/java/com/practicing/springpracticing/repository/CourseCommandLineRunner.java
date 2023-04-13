package com.practicing.springpracticing.repository;

import com.practicing.springpracticing.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;


@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "AWS", "JOHN SMITH"));
        repository.save(new Course(2, "JAVA 11", "JOHN SMITH"));
        repository.save(new Course(3, "SPRING MVC", "JOHN SMITH"));
        repository.save(new Course(4, "MongoDB", "Jack Andrews"));
        repository.save(new Course(5, "H2", "Jack Andrews"));

        repository.deleteById(1l);

//        System.out.println("FIND BY ID >>>>>>>>>>>" +repository.findById(2l));
//        System.out.println("FIND BY ID >>>>>>>>>>>" +repository.findById(3l));
//
//        System.out.println("FIND ALL >>>>>>>>>>>" + repository.findAll());
//        System.out.println("TOTAL >>>>>>>>>>>" +repository.count());
//
//        System.out.println("FIND BY AUTHOR >>>>>>>>>>>" +repository.findByAuthor("JOHN SMITH"));
//        System.out.println("FIND EMPTY >>>>>>>>>>>" +repository.findByAuthor(""));
//
//        System.out.println("FIND BY NAME >>>>>>>>>>>" +repository.findByName("MongoDB"));
//        System.out.println("FIND BY NAME >>>>>>>>>>>" +repository.findByName("H2"));


    }

}

