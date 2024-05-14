package com.example.demoProject.service.impl;

import com.example.demoProject.model.Tutorial;
import com.example.demoProject.repository.TutorialRepository;
import com.example.demoProject.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TutorialServiceImpl  implements TutorialService {
    @Autowired
    TutorialRepository tutorialRepository ;

    public void addTutorial(Tutorial tutorial) {
        Tutorial savedTut = tutorialRepository.save(tutorial);
        System.out.println(tutorial);
    }
}
