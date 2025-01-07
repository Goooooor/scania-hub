package com.gor.scaniamockbackend.service;

import com.gor.scaniamockbackend.DTO.BusResponseDTO;
import com.gor.scaniamockbackend.DTO.TruckResponseDTO;
import com.gor.scaniamockbackend.model.vehicles.Bus;
import com.gor.scaniamockbackend.model.vehicles.Truck;
import com.gor.scaniamockbackend.repository.BusRepository;
import com.gor.scaniamockbackend.repository.TruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BusService {

    //TODO: remove ID and create DTO (response/request)

    @Autowired
    private BusRepository busRepository;

    // DTO to strip the internal id
    public List<BusResponseDTO> getBusesByFilters(String series, String engine, Boolean inProduction, Boolean isAutomatic) {
        List<Bus> buses = busRepository.findBusesByFilters(series, engine, inProduction, isAutomatic);

        return buses.stream()
                .map(bus -> new BusResponseDTO(
                        bus.getType(),
                        bus.getEngine(),
                        bus.getBattery(),
                        bus.isAutomatic(),
                        bus.getBusSeries().name(),
                        bus.isInProduction(),
                        bus.getModel().name()
                ))
                .collect(Collectors.toList());
    }
}
