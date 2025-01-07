package com.gor.scaniamockbackend.model.vehicledetails;

public class Engine {
    private EngineType type; //  "diesel", "gas", "electric"
    private int horsepower;

    public Engine(EngineType type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    // Special enum class
    public enum EngineType {
        DIESEL,
        GAS,
        ELECTRIC
    }
}