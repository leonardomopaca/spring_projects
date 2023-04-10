package com.practicing.springpracticing.repository;

import com.practicing.springpracticing.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
}
