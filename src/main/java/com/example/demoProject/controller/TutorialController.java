package com.example.demoProject.controller;

import com.example.demoProject.model.Tutorial;
import com.example.demoProject.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorialController {
    @Autowired
    TutorialService tutorialService;
    @PostMapping("/addTutorial")
    public String addTutorial(@RequestBody Tutorial tutorial) {
        tutorialService.addTutorial(tutorial);
        return "Empty";
    }

}
