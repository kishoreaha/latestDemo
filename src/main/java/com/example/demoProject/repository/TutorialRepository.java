package com.example.demoProject.repository;

import com.example.demoProject.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findAll();
}
