package com.codejam.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "REVENUE")
public class Revenue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "monthly_rate")
    private String monthlyRate;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "date_time")
    private String dateTime;

    public Revenue(int id, String monthlyRate, String eventName, String dateTime) {
        this.id = id;
        this.monthlyRate = monthlyRate;
        this.eventName = eventName;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(String monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
