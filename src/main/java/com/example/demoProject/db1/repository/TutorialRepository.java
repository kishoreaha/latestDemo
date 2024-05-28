package com.example.demoProject.db1.repository;

import com.example.demoProject.db1.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findAll();
}
