package UserModule.controllers;

import UserModule.models.Location;
import UserModule.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/locations")
public class LocationsController {
    @Autowired
    private LocationRepository locationRepository;

    @GetMapping
    public List<Location> list() {
        return locationRepository.findAll();
    }
}
