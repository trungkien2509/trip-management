package com.example.tripmanagement.model;

import java.util.Date;

public class Trip {
    private int tripId;
    private String tripName;
    private String destination;
    private String date;
    private String riskAssessment;
    private String description;
    private String budget;

    public Trip(int tripId, String tripName, String destination, String date, String riskAssessment, String description, String budget) {
        this.tripId = tripId;
        this.tripName = tripName;
        this.destination = destination;
        this.date = date;
        this.riskAssessment = riskAssessment;
        this.description = description;
        this.budget = budget;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRiskAssessment() {
        return riskAssessment;
    }

    public void setRiskAssessment(String riskAssessment) {
        this.riskAssessment = riskAssessment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }
}
