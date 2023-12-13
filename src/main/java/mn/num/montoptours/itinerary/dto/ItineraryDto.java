/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mn.num.montoptours.itinerary.dto;

import java.util.Date;

/**
 *
 * @author turmu
 */
public class ItineraryDto {

    private int id;
    private int destination_id;
    private int food_id;
    private int leisure_id;
    private int transpotation_id;
    private String name;
    private int day;
    private Date start_date;
    private Date end_date;
    private String note;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDestination_id() {
        return destination_id;
    }

    public void setDestination_id(int destination_id) {
        this.destination_id = destination_id;
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

    public int getTranspotation_id() {
        return transpotation_id;
    }

    public void setTranspotation_id(int transpotation_id) {
        this.transpotation_id = transpotation_id;
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

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
