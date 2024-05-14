package com.example.demoProject.course.jdbc;

import com.example.demoProject.model.Course;
import com.example.demoProject.repository.CourseJDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJDBCRepository courseJDBCRepository;

    @Autowired
    private CourseJDBCRepository courseJPARepository;

//    @Override
//    public void run(String... args) throws Exception {
//        courseJDBCRepository.insert();
//    }
    @Override
    public void run(String... args) throws Exception {
//        courseJDBCRepository.insert(new Course(1,"Learn AWS Now","in28Mins"));
//        courseJDBCRepository.insert(new Course(2,"Learn Azure Now","in28Mins"));
//        courseJDBCRepository.insert(new Course(3,"Learn GCP Now","in28Mins"));
//        courseJDBCRepository.delete(2);
//        System.out.println(courseJDBCRepository.retrieve(3));

        courseJPARepository.insert(new Course(1,"Learn AWS Now","in28Mins"));
        courseJPARepository.insert(new Course(2,"Learn Azure Now","in28Mins"));
        courseJPARepository.insert(new Course(3,"Learn GCP Now","in28Mins"));
        courseJPARepository.delete(2);
        System.out.println(courseJPARepository.retrieve(3));
    }
}
