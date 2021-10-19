package com.example.spring_api.controllers;

import com.example.spring_api.models.Location;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/locations")
public class LocationsController {
    @GetMapping
    public String getLocation(@ModelAttribute("location") Location location) {
        return "location";
    }
}
