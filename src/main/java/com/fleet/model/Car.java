package com.fleet.model;

import com.fleet.interfaces.Inspectable;

public abstract class Car implements Inspectable {
    private String name;
    private int year;
    private String model;
    private int id;

    public Car(String name, int year, String model, int id) {
        this.name = name;
        this.year = year;
        this.model = model;
        this.id = id;
    }

    public abstract double calculateMaintenanceCost();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
