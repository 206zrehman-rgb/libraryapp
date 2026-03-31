package com.ZainRehman.libraryapp.Models;

import java.time.LocalDate;
import java.io.Serializable;


public class book implements Serializable {

    private String name;
    private String description;
    private String startDate;
    private String endDate;
    private float score;

    public book(String name, String description, String startDate, String endDate, float score){
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.score = score;
    }

    public void setName(String name){
        this.name= name;
    }

    public String getName(){
        return name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setEndDate(String endDate){
        this.endDate = endDate;
    }

    public String getEndDate(){
        return endDate;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public float getScore(){
        return score;
    }

    @Override
    public String toString(){
        return "book name: " + name  ;
    }
}
