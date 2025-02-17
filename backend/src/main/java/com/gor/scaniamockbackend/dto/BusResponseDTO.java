package com.gor.scaniamockbackend.dto;

import com.gor.scaniamockbackend.domain.vehicledetails.Battery;
import com.gor.scaniamockbackend.domain.vehicledetails.Engine;

public class BusResponseDTO {

    private Engine engine;
    private Battery battery;
    private boolean isAutomatic;
    private String series;
    private String model;
    private boolean inProduction;
    private String type;



    public BusResponseDTO(String type, Engine engine, Battery battery, boolean isAutomatic, String series, boolean inProduction, String model) {
        this.type = type;
        this.engine = engine;
        this.battery = battery;
        this.isAutomatic = isAutomatic;
        this.series = series;
        this.inProduction = inProduction;
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setModel(String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public boolean isInProduction() {
        return inProduction;
    }

    public void setInProduction(boolean inProduction) {
        this.inProduction = inProduction;
    }
}
