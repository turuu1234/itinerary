/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mn.num.montoptours.itinerary.service;

import jakarta.transaction.Transactional;
import java.util.List;
import mn.num.montoptours.itinerary.entity.TransportationEntity;
import mn.num.montoptours.itinerary.repository.TransportationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author turmu
 */
@Service
public class TransportationService {
    private final TransportationRepository transportationRepository;
    
    @Autowired
    public TransportationService(TransportationRepository transportationRepository) {
        this.transportationRepository = transportationRepository;
    }
    
    public List<TransportationEntity> getAllTransportation() {
        return transportationRepository.findAll();
    }
    
    @Transactional
    public void saveTransportation(TransportationEntity entity) {
        transportationRepository.save(entity);
    }
}
