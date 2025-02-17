package com.gor.scaniamockbackend.domain.vehicles;

import com.gor.scaniamockbackend.domain.vehicledetails.Battery;
import com.gor.scaniamockbackend.domain.vehicledetails.Engine;

public abstract class Vehicle {


    private String id;
    private String make = "Scania"; // Default for all vehicles
    private Engine engine;
    private Battery battery;
    private boolean isAutomatic;
    private String type;


    public Vehicle(String id, String type, Engine engine, Battery battery, boolean isAutomatic) {
        this.id = id;
        this.engine = engine;
        this.battery = battery;
        this.isAutomatic = isAutomatic;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Engine getEngine() {
        return engine;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

}
