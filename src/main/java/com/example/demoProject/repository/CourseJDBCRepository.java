package com.example.demoProject.repository;

import com.example.demoProject.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class CourseJDBCRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

//    private static String INSERT_QUERY= """
//            INSERT INTO COURSE (id,name,authour) VALUES(1,'Learn AWS','in28mins');
//            """;
//    public void insert(){
//        springJdbcTemplate.update(INSERT_QUERY);
//    }

        private static String INSERT_QUERY= """
            INSERT INTO COURSE (id,name,authour) VALUES(?,?,?);
            """;

    private static String DELETE_QUERY= """
            DELETE FROM COURSE where id=?;
            """;


    private static String SELECT_QUERY= """
            SELECT * FROM COURSE where id=?;
            """;

    public void insert(Course course){
        springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthour());
    }

    public void delete(int id){
        springJdbcTemplate.update(DELETE_QUERY,id);
    }


    public Course retrieve(int id){
        return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class),id) ;
    }

}
