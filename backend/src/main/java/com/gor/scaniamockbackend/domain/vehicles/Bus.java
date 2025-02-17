package com.gor.scaniamockbackend.domain.vehicles;

import com.gor.scaniamockbackend.domain.vehicledetails.Battery;
import com.gor.scaniamockbackend.domain.vehicledetails.BusClassification;
import com.gor.scaniamockbackend.domain.vehicledetails.Engine;

public class Bus extends Vehicle {

    //private BussModel model;
    private BusClassification.BusModel model;
    private BusClassification.BusSeries busSeries;
    private boolean inProduction;

    public Bus(String id, Engine engine, Battery battery, boolean isAutomatic, BusClassification.BusSeries busSeries, BusClassification.BusModel model) {
        super(id,"Bus", engine, battery, isAutomatic);
        this.busSeries = busSeries;
        this.model = model;
        this.inProduction = inProduction(busSeries);
    }

    public boolean inProduction(BusClassification.BusSeries busSeries) {
        if (
                busSeries == BusClassification.BusSeries.CITYWIDE ||
                busSeries == BusClassification.BusSeries.INTERLINK ||
                        busSeries == BusClassification.BusSeries.OMNILINE
        ) {
            return false;
        }
        return true;
    }

    public BusClassification.BusModel getModel() {
        return model;
    }

    public void setModel(BusClassification.BusModel model) {
        this.model = model;
    }

    public BusClassification.BusSeries getBusSeries() {
        return busSeries;
    }

    public void setBusSeries(BusClassification.BusSeries busSeries) {
        this.busSeries = busSeries;
    }

    public boolean isInProduction() {
        return inProduction;
    }

    public void setInProduction(boolean inProduction) {
        this.inProduction = inProduction;
    }




}
