/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mn.num.montoptours.itinerary.facade;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import mn.num.montoptours.itinerary.entity.DestinationEntity;

/**
 *
 * @author turmu
 */
public class DestinationFacade extends AbstractFacade<DestinationEntity>{
    
    EntityManager em;
    
    public DestinationFacade() {
        super(DestinationEntity.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public DestinationEntity findByName(String name) {
        try {
            TypedQuery<DestinationEntity> query = em.createQuery(
                    "SELECT d FROM DestinationEntity d WHERE d.name = :name", DestinationEntity.class)
                    .setParameter("name", name);

            return query.getSingleResult();
        } finally {
            em.close();
        }
    }
    
}
