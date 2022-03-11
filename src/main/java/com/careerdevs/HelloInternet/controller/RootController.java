package com.careerdevs.HelloInternet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class RootController {

    @GetMapping("/")
 public String RootRoute (){
        return"You requested root route";

    }
}
