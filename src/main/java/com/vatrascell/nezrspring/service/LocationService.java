package com.vatrascell.nezrspring.service;

import com.vatrascell.nezrspring.model.Location;
import com.vatrascell.nezrspring.repository.LocationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class LocationService {

    private LocationRepository locationRepository;

    public List<Location> getLocations() {
        List<Location> result = new ArrayList<>();
        locationRepository.findAll().forEach(result::add);
        return result;
    }
}
