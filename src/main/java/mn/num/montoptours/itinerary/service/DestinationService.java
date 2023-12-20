/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mn.num.montoptours.itinerary.service;

import jakarta.transaction.Transactional;
import java.util.List;
import mn.num.montoptours.itinerary.entity.DestinationEntity;
import mn.num.montoptours.itinerary.repository.DestinationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author turmu
 */
@Service
public class DestinationService {

    private final DestinationRepository destinationRepository;

    @Autowired
    public DestinationService(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;
    }

    public List<DestinationEntity> getAllDestinations() {
        return destinationRepository.findAll();
    }

    @Transactional
    public void saveDestination(DestinationEntity destination) {
        destinationRepository.save(destination);
    }
}
