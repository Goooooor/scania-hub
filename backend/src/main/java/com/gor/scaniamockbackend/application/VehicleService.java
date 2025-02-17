package com.gor.scaniamockbackend.application;

import com.gor.scaniamockbackend.dto.VehicleResponseDTO;
import com.gor.scaniamockbackend.domain.vehicles.Bus;
import com.gor.scaniamockbackend.domain.vehicles.Truck;
import com.gor.scaniamockbackend.repository.BusRepository;
import com.gor.scaniamockbackend.repository.TruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

@Service
public class VehicleService {

    @Autowired
    private BusRepository busRepository;

    @Autowired
    private TruckRepository truckRepository;

    // Fetch all vehicles
    public List<VehicleResponseDTO> getVehiclesByFilters(String series, String engine, Boolean inProduction, Boolean isAutomatic) {
        List<Bus> buses = busRepository.findBusesByFilters(series, engine, inProduction, isAutomatic);
        List<Truck> trucks = truckRepository.findTrucksByFilters(series, engine, inProduction, isAutomatic);


        List<VehicleResponseDTO> vehicles = new ArrayList<>();

        // Convert buses
        vehicles.addAll(buses.stream().map(bus -> new VehicleResponseDTO(
                bus.getType(),
                bus.getEngine(),
                bus.getBattery(),
                bus.isAutomatic(),
                bus.getModel().name(),
                bus.getBusSeries().name(),
                bus.isInProduction()
        )).collect(Collectors.toList()));

        // Convert trucks
        vehicles.addAll(trucks.stream().map(truck -> new VehicleResponseDTO(
                truck.getType(),
                truck.getEngine(),
                truck.getBattery(),
                truck.isAutomatic(),
                truck.getModel().name(),
                truck.getSeries().name(),
                truck.isInProduction()
        )).collect(Collectors.toList()));

        return vehicles;
    }
}
