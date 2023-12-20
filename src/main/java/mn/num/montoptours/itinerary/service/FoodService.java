/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mn.num.montoptours.itinerary.service;

import jakarta.transaction.Transactional;
import java.util.List;
import mn.num.montoptours.itinerary.entity.FoodEntity;
import mn.num.montoptours.itinerary.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author turmu
 */
@Service
public class FoodService {
    private final FoodRepository foodRepository;
    
    @Autowired
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }
    
    public List<FoodEntity> getAllFoods() {
        return foodRepository.findAll();
    }
    
    @Transactional
    public void saveDestination(FoodEntity food) {
        foodRepository.save(food);
    }
}
