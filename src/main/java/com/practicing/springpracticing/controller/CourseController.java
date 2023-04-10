package com.practicing.springpracticing.controller;

import com.practicing.springpracticing.entity.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> listAllCourses(){
        return Arrays.asList(
                new Course(1, "Math3", "John"),
                new Course(2, "Science", "Peter"),
                new Course(3, "Programming", "Mary")
        );
    }
}
