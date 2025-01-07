package com.gor.scaniamockbackend.service;

import com.gor.scaniamockbackend.DTO.TruckResponseDTO;
import com.gor.scaniamockbackend.model.vehicles.Truck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gor.scaniamockbackend.repository.TruckRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TruckService {

    //TODO: remove ID and create DTO (response/request)

    @Autowired
    private TruckRepository truckRepository;

    public List<TruckResponseDTO> getTrucksByFilters(String model,  String engine, Boolean inProduction, Boolean isAutomatic) {
        List<Truck> trucks = truckRepository.findTrucksByFilters(model, engine, inProduction, isAutomatic);

        return trucks.stream()
                .map(truck -> new TruckResponseDTO(
                        truck.getType(),
                        truck.getEngine(),
                        truck.getBattery(),
                        truck.isAutomatic(),
                        truck.getModel().name(),
                        truck.getSeries().name(),
                        truck.isInProduction()
                ))
                .collect(Collectors.toList());

    }

}
