package com.example.demoProject.controller;

import com.example.demoProject.db1.model.Tutorial;
import com.example.demoProject.db2.model.TutorialDB2;
import com.example.demoProject.service.TutorialDB2Service;
import com.example.demoProject.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TutorialController {
    @Autowired
    TutorialService tutorialService;

    @Autowired
    TutorialDB2Service tutorialDB2Service;

    @PostMapping("/addTutorial")
    public String addTutorial(@RequestBody Tutorial tutorial) {
        tutorialService.addTutorial(tutorial);
        return "Empty";
    }

    @GetMapping("/getData")
    public String getMessage(){
        return "AccessedByHttps";
    }


    @PostMapping("/addDB2Tutorial")
    public String addTutorial(@RequestBody TutorialDB2 tutorial) {
        tutorialDB2Service.addTutorial(tutorial);
        return "Empty";
    }

}
