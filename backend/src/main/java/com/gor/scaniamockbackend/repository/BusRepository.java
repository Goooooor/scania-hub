package com.gor.scaniamockbackend.repository;

import com.gor.scaniamockbackend.model.vehicledetails.Battery;
import com.gor.scaniamockbackend.model.vehicledetails.BusClassification;
import com.gor.scaniamockbackend.model.vehicledetails.Engine;
import com.gor.scaniamockbackend.model.vehicles.Bus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BusRepository {



    private List<Bus> buses = new ArrayList<Bus>();

    public BusRepository() {
        // Hardcoded buses, meant for demonstration purposes only and might not be correct information
        buses.add(new Bus("B1", new Engine(Engine.EngineType.DIESEL, 350), new Battery(60, 150), true, BusClassification.BusSeries.FENCER, BusClassification.BusModel.F1));
        buses.add(new Bus("B2", new Engine(Engine.EngineType.GAS, 380), new Battery(540, 200), true, BusClassification.BusSeries.FENCER, BusClassification.BusModel.F6));
        buses.add(new Bus("B3", new Engine(Engine.EngineType.DIESEL, 310), new Battery(320, 150), false, BusClassification.BusSeries.TOURING, BusClassification.BusModel.HD));
        buses.add(new Bus("B4", new Engine(Engine.EngineType.GAS, 400), new Battery(480, 180), true, BusClassification.BusSeries.IRIZAR, BusClassification.BusModel.I4));
        buses.add(new Bus("B5", new Engine(Engine.EngineType.DIESEL, 330), new Battery(410, 170), true, BusClassification.BusSeries.OMNILINE, BusClassification.BusModel.L12));
        buses.add(new Bus("B6", new Engine(Engine.EngineType.ELECTRIC, 280), new Battery(270, 120), false, BusClassification.BusSeries.CITYWIDE, BusClassification.BusModel.LF));
        buses.add(new Bus("B7", new Engine(Engine.EngineType.DIESEL, 300), new Battery(370, 150), true, BusClassification.BusSeries.CITYWIDE, BusClassification.BusModel.LE));
        buses.add(new Bus("B8", new Engine(Engine.EngineType.GAS, 340), new Battery(420, 160), true, BusClassification.BusSeries.INTERLINK, BusClassification.BusModel.LD));
        buses.add(new Bus("B9", new Engine(Engine.EngineType.DIESEL, 370), new Battery(450, 180), false, BusClassification.BusSeries.INTERLINK, BusClassification.BusModel.MD));
        buses.add(new Bus("B10", new Engine(Engine.EngineType.ELECTRIC, 390), new Battery(500, 200), true, BusClassification.BusSeries.INTERLINK, BusClassification.BusModel.HD));
        buses.add(new Bus("B11", new Engine(Engine.EngineType.GAS, 450), new Battery(548, 250), true, BusClassification.BusSeries.OMNICITY, BusClassification.BusModel.DOUBLE_DECKER));
        buses.add(new Bus("B12", new Engine(Engine.EngineType.DIESEL, 400), new Battery(520, 200), true, BusClassification.BusSeries.OMNICITY, BusClassification.BusModel.ARTICULATED));
        buses.add(new Bus("B13", new Engine(Engine.EngineType.DIESEL, 320), new Battery(300, 120), false, BusClassification.BusSeries.OMNILINK, BusClassification.BusModel.L12));
        buses.add(new Bus("B14", new Engine(Engine.EngineType.DIESEL, 350), new Battery(350, 140), true, BusClassification.BusSeries.OMNILINK, BusClassification.BusModel.L18));
        buses.add(new Bus("B15", new Engine(Engine.EngineType.GAS, 430), new Battery(500, 200), true, BusClassification.BusSeries.METROLINK, BusClassification.BusModel.HD));
        buses.add(new Bus("B16", new Engine(Engine.EngineType.DIESEL, 310), new Battery(330, 150), false, BusClassification.BusSeries.METROLINK, BusClassification.BusModel.L13));
        buses.add(new Bus("B17", new Engine(Engine.EngineType.GAS, 360), new Battery(410, 190), true, BusClassification.BusSeries.CAPITOL, BusClassification.BusModel.C70));
        buses.add(new Bus("B18", new Engine(Engine.EngineType.DIESEL, 340), new Battery(370, 170), true, BusClassification.BusSeries.CAPITOL, BusClassification.BusModel.C75));
        buses.add(new Bus("B19", new Engine(Engine.EngineType.DIESEL, 350), new Battery(380, 160), false, BusClassification.BusSeries.CAPITOL, BusClassification.BusModel.C76));
        buses.add(new Bus("B20", new Engine(Engine.EngineType.GAS, 280), new Battery(290, 140), true, BusClassification.BusSeries.MAXCI, BusClassification.BusModel.CN113CLL));
        buses.add(new Bus("B21", new Engine(Engine.EngineType.DIESEL, 300), new Battery(350, 140), false, BusClassification.BusSeries.OMNIEXPRESS, BusClassification.BusModel.V3_20));
        buses.add(new Bus("B22", new Engine(Engine.EngineType.ELECTRIC, 320), new Battery(400, 150), true, BusClassification.BusSeries.OMNIEXPRESS, BusClassification.BusModel.V3_40));
        buses.add(new Bus("B23", new Engine(Engine.EngineType.GAS, 340), new Battery(430, 160), true, BusClassification.BusSeries.OMNIEXPRESS, BusClassification.BusModel.V3_60));
        buses.add(new Bus("B24", new Engine(Engine.EngineType.DIESEL, 250), new Battery(270, 120), false, BusClassification.BusSeries.K, BusClassification.BusModel.K250));
        buses.add(new Bus("B25", new Engine(Engine.EngineType.DIESEL, 280), new Battery(310, 130), true, BusClassification.BusSeries.K, BusClassification.BusModel.K280));
        buses.add(new Bus("B26", new Engine(Engine.EngineType.GAS, 320), new Battery(360, 150), true, BusClassification.BusSeries.K, BusClassification.BusModel.K320));
        buses.add(new Bus("B27", new Engine(Engine.EngineType.DIESEL, 360), new Battery(420, 170), true, BusClassification.BusSeries.K, BusClassification.BusModel.K360));
        buses.add(new Bus("B28", new Engine(Engine.EngineType.ELECTRIC, 400), new Battery(500, 190), true, BusClassification.BusSeries.K, BusClassification.BusModel.K400));
        buses.add(new Bus("B29", new Engine(Engine.EngineType.GAS, 450), new Battery(548, 200), true, BusClassification.BusSeries.K, BusClassification.BusModel.K450));
        buses.add(new Bus("B30", new Engine(Engine.EngineType.DIESEL, 230), new Battery(260, 110), false, BusClassification.BusSeries.N, BusClassification.BusModel.N230UB));
        buses.add(new Bus("B31", new Engine(Engine.EngineType.DIESEL, 280), new Battery(350, 140), true, BusClassification.BusSeries.N, BusClassification.BusModel.N280UB));
        buses.add(new Bus("B32", new Engine(Engine.EngineType.GAS, 310), new Battery(390, 150), true, BusClassification.BusSeries.N, BusClassification.BusModel.N310UA));
        buses.add(new Bus("B33", new Engine(Engine.EngineType.ELECTRIC, 340), new Battery(420, 160), true, BusClassification.BusSeries.CF, BusClassification.BusModel.CF65));
        buses.add(new Bus("B34", new Engine(Engine.EngineType.DIESEL, 360), new Battery(470, 180), true, BusClassification.BusSeries.CF, BusClassification.BusModel.CF75));
        buses.add(new Bus("B35", new Engine(Engine.EngineType.DIESEL, 400), new Battery(520, 200), true, BusClassification.BusSeries.CF, BusClassification.BusModel.CF110));
        buses.add(new Bus("B36", new Engine(Engine.EngineType.GAS, 240), new Battery(280, 140), true, BusClassification.BusSeries.METROPOL, BusClassification.BusModel.C50));
        buses.add(new Bus("B37", new Engine(Engine.EngineType.ELECTRIC, 280), new Battery(300, 150), false, BusClassification.BusSeries.N, BusClassification.BusModel.LINE_12M));
        buses.add(new Bus("B38", new Engine(Engine.EngineType.DIESEL, 300), new Battery(370, 180), true, BusClassification.BusSeries.L, BusClassification.BusModel.LINE_13_7M));
        buses.add(new Bus("B39", new Engine(Engine.EngineType.DIESEL, 240), new Battery(260, 120), false, BusClassification.BusSeries.N, BusClassification.BusModel.N113));
        buses.add(new Bus("B40", new Engine(Engine.EngineType.DIESEL, 260), new Battery(320, 130), true, BusClassification.BusSeries.L, BusClassification.BusModel.L113));


    }

    public List<Bus> findBusesByFilters(String series, String engine, Boolean inProduction, Boolean isAutomatic) {
        return buses.stream()
                // Filter by series if provided
                .filter(bus -> series == null || bus.getBusSeries().name().equalsIgnoreCase(series))
                // Filter by engine if provided
                .filter(bus -> engine == null || bus.getEngine().getType().name().equalsIgnoreCase(engine))
                // Filter by inProduction if provided
                // Must use the wrapper class Boolean
                .filter(bus -> inProduction == null || bus.isInProduction() == inProduction)
                .filter(bus -> isAutomatic == null || bus.isAutomatic() == isAutomatic)
                .collect(Collectors.toList());
    }


}
