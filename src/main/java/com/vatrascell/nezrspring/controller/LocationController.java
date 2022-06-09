package com.vatrascell.nezrspring.controller;

import com.vatrascell.nezrspring.service.LocationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/location")
@AllArgsConstructor
public class LocationController {

    private LocationService locationService;

    @GetMapping
    public ResponseEntity<?> getLocations() {
        return ResponseEntity.ok(locationService.getLocations());
    }
}
