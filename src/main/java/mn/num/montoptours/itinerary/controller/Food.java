/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mn.num.montoptours.itinerary.controller;

import java.util.List;
import mn.num.montoptours.itinerary.entity.FoodEntity;
import mn.num.montoptours.itinerary.service.FoodService;
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
@RequestMapping("/foods")
public class Food {
    
    @Autowired
    private FoodService foodService;
    
    @GetMapping
    public List<FoodEntity> getAllDestinations() {
        return foodService.getAllFoods();
    }

    @PostMapping
    public void createDestination(@RequestBody FoodEntity foodEntity) {
        foodService.saveDestination(foodEntity);
    }
    
}
