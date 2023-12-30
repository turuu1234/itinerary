/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mn.num.montoptours.itinerary.service;

import jakarta.transaction.Transactional;
import java.util.List;
import mn.num.montoptours.itinerary.entity.LeisureEntity;
import mn.num.montoptours.itinerary.repository.LeisureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author turmu
 */
@Service
public class LeisureService {
    
    private final LeisureRepository leisureRepository;
    
    @Autowired
    public LeisureService(LeisureRepository leisureRepository){
        this.leisureRepository = leisureRepository;
    }
    
    public List<LeisureEntity> getAllLeisures() {
        return leisureRepository.findAll();
    }
    
    @Transactional
    public void saveLeisure(LeisureEntity entity) {
        leisureRepository.save(entity);
    }
}
