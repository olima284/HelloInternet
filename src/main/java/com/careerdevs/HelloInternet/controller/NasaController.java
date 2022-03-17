package com.careerdevs.HelloInternet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping ("/nasa")

public class NasaController {
    private String myNasaKey = "sKewRHb982KWI7QoEKZ9YhdLwkLpdzAcht9Jrnwe";

    private String nasaApodEndpoint = "https://api.nasa.gov/planetary/apod?api_key=" + myNasaKey;

    @GetMapping("/test")
    private String testRoute () {
        return "testing, request received";
    }


}
