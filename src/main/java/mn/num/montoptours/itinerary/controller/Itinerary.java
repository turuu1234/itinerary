/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mn.num.montoptours.itinerary.controller;

import java.util.List;
import mn.num.montoptours.itinerary.entity.ItineraryEntity;
import mn.num.montoptours.itinerary.service.ItineraryService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/itinerary")
public class Itinerary {
    @Autowired
    ItineraryService itineraryService;
    
    @GetMapping
    public List<ItineraryEntity> getAllItinerary() {
        return itineraryService.findAll();
    }
    
    @PostMapping
    public void create(@RequestBody ItineraryEntity entity) {
        itineraryService.saveItinerary(entity);
    }
}
