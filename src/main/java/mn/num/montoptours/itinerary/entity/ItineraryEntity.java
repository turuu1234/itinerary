/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mn.num.montoptours.itinerary.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import javax.ejb.Stateless;

/**
 *
 * @author turmu
 */
@Entity
@Table
@Stateless
public class ItineraryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "destination_id")
    private int dest_id;
    @Column(name = "food_id")
    private int food_id;
    @Column(name = "leisure_id")
    private int leisure_id;
    @Column(name = "transportation_id")
    private int trans_id;
    @Column(name = "name")
    private String name;
    @Column(name = "day")
    private int day;
    @Column(name = "note")
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDest_id() {
        return dest_id;
    }

    public void setDest_id(int dest_id) {
        this.dest_id = dest_id;
    }

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public int getLeisure_id() {
        return leisure_id;
    }

    public void setLeisure_id(int leisure_id) {
        this.leisure_id = leisure_id;
    }

    public int getTrans_id() {
        return trans_id;
    }

    public void setTrans_id(int trans_id) {
        this.trans_id = trans_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
