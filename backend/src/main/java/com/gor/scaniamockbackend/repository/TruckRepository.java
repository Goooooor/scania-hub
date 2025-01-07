package com.gor.scaniamockbackend.repository;

import com.gor.scaniamockbackend.model.vehicledetails.TruckClassification;
import com.gor.scaniamockbackend.model.vehicles.Truck;
import com.gor.scaniamockbackend.model.vehicledetails.Battery;
import com.gor.scaniamockbackend.model.vehicledetails.Engine;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TruckRepository {



    private List<Truck> trucks = new ArrayList<Truck>();


    public TruckRepository() {
        // Hardcoded trucks, meant for demonstration purposes only and might not be correct information
        trucks.add(new Truck("T1", new Engine(Engine.EngineType.GAS, 280), new Battery(60, 150), true, TruckClassification.TruckSeries.P_SERIES, TruckClassification.TruckModel.P280));
        trucks.add(new Truck("T2", new Engine(Engine.EngineType.ELECTRIC, 320), new Battery(120, 180), true, TruckClassification.TruckSeries.P_SERIES, TruckClassification.TruckModel.P320));
        trucks.add(new Truck("T3", new Engine(Engine.EngineType.DIESEL, 360), new Battery(64, 170), false, TruckClassification.TruckSeries.P_SERIES, TruckClassification.TruckModel.P360));
        trucks.add(new Truck("T4", new Engine(Engine.EngineType.GAS, 410), new Battery(140, 200), true, TruckClassification.TruckSeries.P_SERIES, TruckClassification.TruckModel.P410));
        trucks.add(new Truck("T5", new Engine(Engine.EngineType.DIESEL, 450), new Battery(100, 220), true, TruckClassification.TruckSeries.P_SERIES, TruckClassification.TruckModel.P450));
        trucks.add(new Truck("T6", new Engine(Engine.EngineType.ELECTRIC, 500), new Battery(140, 250), true, TruckClassification.TruckSeries.P_SERIES, TruckClassification.TruckModel.P500));
        trucks.add(new Truck("T7", new Engine(Engine.EngineType.DIESEL, 540), new Battery(120, 280), true, TruckClassification.TruckSeries.P_SERIES, TruckClassification.TruckModel.P540));
        trucks.add(new Truck("T8", new Engine(Engine.EngineType.DIESEL, 320), new Battery(96, 160), true, TruckClassification.TruckSeries.G_SERIES, TruckClassification.TruckModel.G320));
        trucks.add(new Truck("T9", new Engine(Engine.EngineType.DIESEL, 360), new Battery(140, 180), true, TruckClassification.TruckSeries.G_SERIES, TruckClassification.TruckModel.G360));
        trucks.add(new Truck("T10", new Engine(Engine.EngineType.ELECTRIC, 410), new Battery(160, 220), false, TruckClassification.TruckSeries.G_SERIES, TruckClassification.TruckModel.G410));
        trucks.add(new Truck("T11", new Engine(Engine.EngineType.GAS, 450), new Battery(120, 250), true, TruckClassification.TruckSeries.G_SERIES, TruckClassification.TruckModel.G450));
        trucks.add(new Truck("T12", new Engine(Engine.EngineType.DIESEL, 500), new Battery(100, 270), true, TruckClassification.TruckSeries.G_SERIES, TruckClassification.TruckModel.G500));
        trucks.add(new Truck("T13", new Engine(Engine.EngineType.DIESEL, 540), new Battery(128, 290), true, TruckClassification.TruckSeries.G_SERIES, TruckClassification.TruckModel.G540));
        trucks.add(new Truck("T14", new Engine(Engine.EngineType.ELECTRIC, 560), new Battery(180, 310), true, TruckClassification.TruckSeries.G_SERIES, TruckClassification.TruckModel.G560));
        trucks.add(new Truck("T15", new Engine(Engine.EngineType.ELECTRIC, 410), new Battery(170, 240), true, TruckClassification.TruckSeries.R_SERIES, TruckClassification.TruckModel.R410));
        trucks.add(new Truck("T16", new Engine(Engine.EngineType.DIESEL, 450), new Battery(130, 260), true, TruckClassification.TruckSeries.R_SERIES, TruckClassification.TruckModel.R450));
        trucks.add(new Truck("T17", new Engine(Engine.EngineType.GAS, 500), new Battery(140, 280), false, TruckClassification.TruckSeries.R_SERIES, TruckClassification.TruckModel.R500));
        trucks.add(new Truck("T18", new Engine(Engine.EngineType.DIESEL, 540), new Battery(150, 300), true, TruckClassification.TruckSeries.R_SERIES, TruckClassification.TruckModel.R540));
        trucks.add(new Truck("T19", new Engine(Engine.EngineType.DIESEL, 580), new Battery(160, 320), true, TruckClassification.TruckSeries.R_SERIES, TruckClassification.TruckModel.R580));
        trucks.add(new Truck("T20", new Engine(Engine.EngineType.ELECTRIC, 620), new Battery(190, 350), true, TruckClassification.TruckSeries.R_SERIES, TruckClassification.TruckModel.R620));
        trucks.add(new Truck("T21", new Engine(Engine.EngineType.GAS, 660), new Battery(140, 380), true, TruckClassification.TruckSeries.R_SERIES, TruckClassification.TruckModel.R660));
        trucks.add(new Truck("T22", new Engine(Engine.EngineType.DIESEL, 730), new Battery(200, 400), true, TruckClassification.TruckSeries.R_SERIES, TruckClassification.TruckModel.R730));
        trucks.add(new Truck("T23", new Engine(Engine.EngineType.ELECTRIC, 450), new Battery(170, 270), true, TruckClassification.TruckSeries.S_SERIES, TruckClassification.TruckModel.S450));
        trucks.add(new Truck("T24", new Engine(Engine.EngineType.DIESEL, 500), new Battery(190, 290), true, TruckClassification.TruckSeries.S_SERIES, TruckClassification.TruckModel.S500));
        trucks.add(new Truck("T25", new Engine(Engine.EngineType.GAS, 540), new Battery(150, 310), false, TruckClassification.TruckSeries.S_SERIES, TruckClassification.TruckModel.S540));
        trucks.add(new Truck("T26", new Engine(Engine.EngineType.DIESEL, 580), new Battery(210, 330), true, TruckClassification.TruckSeries.S_SERIES, TruckClassification.TruckModel.S580));
        trucks.add(new Truck("T27", new Engine(Engine.EngineType.ELECTRIC, 650), new Battery(250, 360), true, TruckClassification.TruckSeries.S_SERIES, TruckClassification.TruckModel.S650));
        trucks.add(new Truck("T28", new Engine(Engine.EngineType.DIESEL, 730), new Battery(230, 380), true, TruckClassification.TruckSeries.S_SERIES, TruckClassification.TruckModel.S730));
        trucks.add(new Truck("T29", new Engine(Engine.EngineType.ELECTRIC, 770), new Battery(300, 400), true, TruckClassification.TruckSeries.S_SERIES, TruckClassification.TruckModel.S770));
        trucks.add(new Truck("T30", new Engine(Engine.EngineType.GAS, 280), new Battery(100, 170), false, TruckClassification.TruckSeries.L_SERIES, TruckClassification.TruckModel.L280));
        trucks.add(new Truck("T31", new Engine(Engine.EngineType.ELECTRIC, 320), new Battery(120, 190), true, TruckClassification.TruckSeries.L_SERIES, TruckClassification.TruckModel.L320));
        trucks.add(new Truck("T32", new Engine(Engine.EngineType.DIESEL, 340), new Battery(90, 200), true, TruckClassification.TruckSeries.L_SERIES, TruckClassification.TruckModel.L340));
        trucks.add(new Truck("T33", new Engine(Engine.EngineType.GAS, 360), new Battery(130, 220), true, TruckClassification.TruckSeries.L_SERIES, TruckClassification.TruckModel.L360));
        trucks.add(new Truck("T34", new Engine(Engine.EngineType.DIESEL, 380), new Battery(140, 240), true, TruckClassification.TruckSeries.L_SERIES, TruckClassification.TruckModel.L380));
        trucks.add(new Truck("T35", new Engine(Engine.EngineType.ELECTRIC, 400), new Battery(180, 260), true, TruckClassification.TruckSeries.L_SERIES, TruckClassification.TruckModel.L400));
        trucks.add(new Truck("T36", new Engine(Engine.EngineType.DIESEL, 360), new Battery(170, 260), true, TruckClassification.TruckSeries.XT_RANGE, TruckClassification.TruckModel.XT360));
        trucks.add(new Truck("T37", new Engine(Engine.EngineType.GAS, 400), new Battery(180, 280), true, TruckClassification.TruckSeries.XT_RANGE, TruckClassification.TruckModel.XT400));
        trucks.add(new Truck("T38", new Engine(Engine.EngineType.ELECTRIC, 450), new Battery(200, 300), true, TruckClassification.TruckSeries.XT_RANGE, TruckClassification.TruckModel.XT450));
        trucks.add(new Truck("T39", new Engine(Engine.EngineType.DIESEL, 500), new Battery(220, 320), true, TruckClassification.TruckSeries.XT_RANGE, TruckClassification.TruckModel.XT500));
        trucks.add(new Truck("T40", new Engine(Engine.EngineType.ELECTRIC, 620), new Battery(280, 350), true, TruckClassification.TruckSeries.XT_RANGE, TruckClassification.TruckModel.XT620));

    }



    public List<Truck> findTrucksByFilters(String series, String engine, Boolean inProduction, Boolean isAutomatic) {
        return trucks.stream()
                // Filter by series if provided
                .filter(truck -> series == null || truck.getSeries().name().equalsIgnoreCase(series))
                // Filter by engine if provided
                .filter(truck -> engine == null || truck.getEngine().getType().name().equalsIgnoreCase(engine))
                .filter(truck -> isAutomatic == null || truck.isAutomatic() == isAutomatic)
                .filter(truck -> inProduction == null || truck.isInProduction() == inProduction)
                .collect(Collectors.toList());
    }


}
