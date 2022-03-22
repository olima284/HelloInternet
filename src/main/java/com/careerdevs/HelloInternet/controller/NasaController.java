package com.careerdevs.HelloInternet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping ("/nasa")

public class NasaController {
    private final String myNasaKey = "sKewRHb982KWI7QoEKZ9YhdLwkLpdzAcht9Jrnwe";

    private String getApodDate;
    private final String nasaApodEndpoint = "https://api.nasa.gov/planetary/apod?api_key=" + myNasaKey + "/&date=" + getApodDate;

       @GetMapping ("/nasa/apod")
    public Object apodHandler (RestTemplate restTemplate){
            return restTemplate.getForObject(nasaApodEndpoint + myNasaKey + getApodDate,  Object.class );
        }
@GetMapping("/nasa/apod/{date}")
    public  String getApodDate(@PathVariable String date){
            return "DATE: " + date;
}
}

