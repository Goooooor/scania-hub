package com.gor.scaniamockbackend.model.vehicles;

import com.gor.scaniamockbackend.model.vehicledetails.Battery;
import com.gor.scaniamockbackend.model.vehicledetails.BusClassification;
import com.gor.scaniamockbackend.model.vehicledetails.Engine;
import com.gor.scaniamockbackend.model.vehicledetails.TruckClassification;

public class Truck extends Vehicle {

    private TruckClassification.TruckSeries truckSeries;
    private TruckClassification.TruckModel model;
    private boolean inProduction;

    public TruckClassification.TruckSeries getSeries() {
        return truckSeries;
    }

    public void setSeries(TruckClassification.TruckSeries truckSeries) {
        this.truckSeries = truckSeries;
    }

    public Truck(String id, Engine engine, Battery battery, boolean isAutomatic, TruckClassification.TruckSeries truckSeries, TruckClassification.TruckModel model) {
        super(id, "Truck", engine, battery, isAutomatic);
        this.model = model;
        this.truckSeries = truckSeries;
        this.inProduction = inProduction(truckSeries);
    }

    public boolean inProduction(TruckClassification.TruckSeries truckSeries) {
        if (truckSeries == TruckClassification.TruckSeries.R_SERIES) {
            return false;
        }
        return true;
    }

    public TruckClassification.TruckModel getModel() {
        return model;
    }

    public void setModel(TruckClassification.TruckModel model) {
        this.model = model;
    }

    public boolean isInProduction() {
        return inProduction;
    }

    public void setInProduction(boolean inProduction) {
        this.inProduction = inProduction;
    }

}
