/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mn.num.montoptours.itinerary.controller;

import java.util.List;
import mn.num.montoptours.itinerary.entity.TransportationEntity;
import mn.num.montoptours.itinerary.service.TransportationService;
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
@RequestMapping("/transportation")
public class Transportation {
    @Autowired
    TransportationService transportationService;
    
    @GetMapping
    public List<TransportationEntity> getAllTransportation() {
        return transportationService.getAllTransportation();
    }
    
    @PostMapping
    public void create(@RequestBody TransportationEntity entity) {
        transportationService.saveTransportation(entity);
    }
}
