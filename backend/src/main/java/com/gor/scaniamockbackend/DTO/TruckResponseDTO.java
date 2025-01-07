package com.gor.scaniamockbackend.DTO;


import com.gor.scaniamockbackend.model.vehicledetails.Battery;
import com.gor.scaniamockbackend.model.vehicledetails.Engine;

public class TruckResponseDTO {

    private Engine engine;
    private Battery battery;
    private boolean isAutomatic;
    private String model;
    private String series;
    private String type;
    private boolean inProduction;


    public TruckResponseDTO(String type, Engine engine, Battery battery, boolean isAutomatic, String model, String series, Boolean inProduction) {
        this.type = type;
        this.engine = engine;
        this.battery = battery;
        this.isAutomatic = isAutomatic;
        this.model = model;
        this.series = series;
        this.inProduction = inProduction;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isInProduction() {
        return inProduction;
    }

    public void setInProduction(boolean inProduction) {
        this.inProduction = inProduction;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
