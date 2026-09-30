package com.fleet.model;

public class CombustionCar extends Car{

    private String emissionSticker;

    public CombustionCar(String name, int year, String model, int id, String emissionSticker) {
        super(name, year, model, id);
        this.emissionSticker = emissionSticker;
    }

    @Override
    public double calculateMaintenanceCost() {
        if (emissionSticker.equalsIgnoreCase("C") || emissionSticker.equalsIgnoreCase("B")) {
            return 1.15;
        }
        return 1;
    }


    @Override
    public boolean needsInspection() {
        return getYear() <= 2019; // config
    }

    public String getEmissionSticker() {
        return emissionSticker;
    }

    public void setEmissionSticker(String emissionSticker) {
        this.emissionSticker = emissionSticker;
    }
}
