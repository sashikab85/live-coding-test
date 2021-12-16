package com.codejam.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "SCHEDULE")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "venue")
    private String venue;

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "date_time")
    private String dateTime;

    public Schedule(int id, String venue, String eventName, String dateTime) {
        this.id = id;
        this.venue = venue;
        this.eventName = eventName;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
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
