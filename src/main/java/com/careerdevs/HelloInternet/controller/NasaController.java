package com.careerdevs.HelloInternet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping

public class NasaController {
    private String myNasaKey = "sKewRHb982KWI7QoEKZ9YhdLwkLpdzAcht9Jrnwe";

    private String nasaApodEndpoint = "https://api.nasa.gov/planetary/apod?api_key=" + myNasaKey;


}
