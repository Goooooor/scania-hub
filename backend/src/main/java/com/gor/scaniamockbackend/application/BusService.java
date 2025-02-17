package com.gor.scaniamockbackend.application;

import com.gor.scaniamockbackend.dto.BusResponseDTO;
import com.gor.scaniamockbackend.domain.vehicles.Bus;
import com.gor.scaniamockbackend.repository.BusRepository;
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
