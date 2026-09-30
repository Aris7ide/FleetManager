package com.fleet.model;

public class ElectricCar extends Car {

    private double batteryCapacity;

    public ElectricCar(String name, int year, String model, int id, double batteryCapacity) {
        super(name, year, model, id);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public double calculateMaintenanceCost() {
        return 0.80;
    }

    public boolean needsInspection() {
        return getYear() <= 2021; //CONFIG
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
