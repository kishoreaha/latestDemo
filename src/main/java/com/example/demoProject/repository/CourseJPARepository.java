package com.example.demoProject.repository;

import com.example.demoProject.model.Course;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJPARepository {
    @Autowired
    EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public void delete(int id){
        Course course = entityManager.find(Course.class,id);
        entityManager.remove(course);
    }

    public Course retrieve(int id){
        return entityManager.find(Course.class,id);
    }
}
