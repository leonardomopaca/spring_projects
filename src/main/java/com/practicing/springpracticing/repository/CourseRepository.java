package com.practicing.springpracticing.repository;

import com.practicing.springpracticing.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY = """
            INSERT INTO course(id, name, author)
            VALUES(?, ?, ?);
            """;

    private static String SELECT_QUERY = """
            SELECT * FROM COURSE WHERE ID = ?;
            """;

    public void insert(){
        springJdbcTemplate.update(INSERT_QUERY);
    }
    public void insertCourse(Course course){
        springJdbcTemplate.update(INSERT_QUERY,
                course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteCourse(Integer id){
        //springJdbcTemplate.execute("DELETE FROM COURSE WHERE ID = ?");
        springJdbcTemplate.update("DELETE FROM COURSE WHERE ID = ?", 1);
    }

    public Course findById(long id){
        return springJdbcTemplate.queryForObject(SELECT_QUERY,
                new BeanPropertyRowMapper<>(Course.class), id);
    }
}
