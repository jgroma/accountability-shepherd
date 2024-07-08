package com.jgroma.accountability_shepherd.dto;

import java.time.LocalDate;

public class Sheep {
    private int id;
    private String name;
    private String purpose;
    private String personality;
    private int age;
    private String skin;
    private int FrequencyInDays;
    private String status;
    private int health;
    private LocalDate dateCreated;
    private LocalDate dateLastFed;
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public int getFrequencyInDays() {
        return FrequencyInDays;
    }

    public void setFrequencyInDays(int frequencyInDays) {
        FrequencyInDays = frequencyInDays;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDate getDateLastFed() {
        return dateLastFed;
    }

    public void setDateLastFed(LocalDate dateLastFed) {
        this.dateLastFed = dateLastFed;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
