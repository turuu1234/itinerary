/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mn.num.montoptours.itinerary.repository;

import mn.num.montoptours.itinerary.entity.TransportationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author turmu
 */
public interface TransportationRepository extends JpaRepository<TransportationEntity, Integer>{
    
}
