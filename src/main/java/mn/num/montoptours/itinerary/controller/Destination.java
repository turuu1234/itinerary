/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mn.num.montoptours.itinerary.controller;

import java.util.List;
import mn.num.montoptours.itinerary.entity.DestinationEntity;
import mn.num.montoptours.itinerary.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author turmu
 */

@RestController
@RequestMapping("/destinations")
public class Destination {

    @Autowired
    private DestinationService destinationService;

    @GetMapping
    public List<DestinationEntity> getAllDestinations() {
        return destinationService.getAllDestinations();
    }

    @PostMapping
    public void createDestination(@RequestBody DestinationEntity destinationEntity) {
        destinationService.saveDestination(destinationEntity);
    }
}
