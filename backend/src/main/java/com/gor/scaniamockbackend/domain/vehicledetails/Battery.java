package com.gor.scaniamockbackend.domain.vehicledetails;

public class Battery {
    private int capacity; // kWh
    private int range; // km

    public Battery(int capacity, int range) {
        this.capacity = capacity;
        this.range = range;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRange() {
        return range;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
