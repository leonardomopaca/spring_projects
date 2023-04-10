package com.practicing.springpracticing.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY = """
            INSERT INTO course(id, name, author)
            VALUES(4, 'MongoDB', 'Jack Andrews');
            """;
    public void insert(){
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
