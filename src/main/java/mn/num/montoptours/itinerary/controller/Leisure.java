/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mn.num.montoptours.itinerary.controller;

import java.util.List;
import mn.num.montoptours.itinerary.entity.LeisureEntity;
import mn.num.montoptours.itinerary.service.LeisureService;
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
@RequestMapping("/leisure")
public class Leisure {
    @Autowired
    LeisureService leisureService;
    
    @GetMapping
    public List<LeisureEntity> getAllLesuire() {
        return leisureService.getAllLeisures();
    }
    
    @PostMapping
    public void create(@RequestBody LeisureEntity entity) {
        leisureService.saveLeisure(entity);
    }
}
