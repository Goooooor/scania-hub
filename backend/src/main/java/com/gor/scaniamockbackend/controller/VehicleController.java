package com.gor.scaniamockbackend.controller;

import com.gor.scaniamockbackend.DTO.VehicleResponseDTO;
import com.gor.scaniamockbackend.utility.SearchQueryValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.gor.scaniamockbackend.service.VehicleService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public ResponseEntity<?> getVehiclesByFilters(
            @RequestParam(required = false) String engine,
            @RequestParam(required = false) String production,
            @RequestParam(required = false) String automatic) {
        // Using <?> because the response can be of different types

        if (engine != null && !SearchQueryValidator.isValidEngine(engine)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Invalid engine: " + engine + ". Try: " + SearchQueryValidator.getValidEngines());
        }

        // Parse boolean values for production status
        Boolean isInProduction = null;
        if (production != null) {
            if (production.equalsIgnoreCase("true")) {
                isInProduction = true;
            } else if (production.equalsIgnoreCase("false")) {
                isInProduction = false;
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("Invalid boolean for production: " + production + ". Try: true or false");
            }
        }

        // Parse boolean values for automatic transmission
        Boolean isAutomatic = null;
        if (automatic != null) {
            if (automatic.equalsIgnoreCase("true")) {
                isAutomatic = true;
            } else if (automatic.equalsIgnoreCase("false")) {
                isAutomatic = false;
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("Invalid boolean for automatic: " + automatic + ". Try: true or false");
            }
        }

        // Fetch vehicles (trucks + buses) from service
        List<VehicleResponseDTO> vehicles = vehicleService.getVehiclesByFilters(
                null,
                engine != null ? engine.toUpperCase() : null,
                isInProduction,
                isAutomatic
        );

        return ResponseEntity.ok(vehicles);
    }
}
