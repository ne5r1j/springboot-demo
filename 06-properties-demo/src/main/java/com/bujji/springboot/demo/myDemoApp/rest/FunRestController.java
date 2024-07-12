package com.bujji.springboot.demo.myDemoApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

//    inject properties for coach.name and team.name

    @Value("${coach.name}")
    private String coachname;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamName(){
        return "Coach: " + coachname + ", Team name: " + teamName;
    }

    // expose "/" that return "Hello World"
    @GetMapping
    public String sayHello(){
        return "Hello World";
    }

    // expose a new endpoint for workout

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }

    @GetMapping("fortune")
    public String getDailyFortune(){
        return "Today is your lucky day";
    }

}
