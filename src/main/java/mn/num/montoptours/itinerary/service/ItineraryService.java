/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mn.num.montoptours.itinerary.service;

import jakarta.transaction.Transactional;
import java.util.List;
import mn.num.montoptours.itinerary.entity.ItineraryEntity;
import mn.num.montoptours.itinerary.repository.ItineraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author turmu
 */
@Service
public class ItineraryService {
    private final ItineraryRepository itineraryRepository;
    
    public ItineraryService(ItineraryRepository itineraryRepository) {
        this.itineraryRepository = itineraryRepository;
    }
    
    @Autowired
    public List<ItineraryEntity> findAll() {
        return itineraryRepository.findAll();
    }
    
    @Transactional
    public void saveItinerary(ItineraryEntity entity) {
        itineraryRepository.save(entity);
    } 
}
