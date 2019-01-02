package com.mb4321.springboot_restapi_v1_xp_simulations.controllers;

import com.mb4321.springboot_restapi_v1_xp_simulations.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    @GetMapping("/api/v1/getgreeting")
    public Greeting getGreeting () {

        Greeting greeting = new Greeting("World Name", "Hello World!!!");

        return greeting;
    }
}
