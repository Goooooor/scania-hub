package com.gor.scaniamockbackend.controller;

import com.gor.scaniamockbackend.DTO.BusResponseDTO;
import com.gor.scaniamockbackend.service.BusService;
import com.gor.scaniamockbackend.utility.SearchQueryValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/buses")
public class BusController {

    @Autowired
    private BusService busService;

    // Using <?> because response can be of different type
    @GetMapping
    public ResponseEntity<?> getBusesByFilters (
            @RequestParam(required = false) String series,
            @RequestParam(required = false) String engine,
            @RequestParam(required = false) String production,
            @RequestParam(required = false) String automatic
    ) {
        // Error will return a String
        if (series != null && !SearchQueryValidator.isValidBusSeries(series)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Invalid series: " + series + ". Try: " + SearchQueryValidator.getValidBusSeries());
        }

        if (engine != null && !SearchQueryValidator.isValidEngine(engine)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Invalid engine: " + engine + ". Try: " + SearchQueryValidator.getValidEngines());
        }


        // Default value if nothing entered
        Boolean isInProduction = null;
        if(production != null) {
            if(production.equalsIgnoreCase("true")) {
                System.out.println("if production !null " + production + " " + isInProduction);
                isInProduction = true;
            }
            else if(production.equalsIgnoreCase("false")) {
                isInProduction = false;
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("Invalid boolean for production: " + production + ". Try: true or false");

            }
        }

        Boolean isAutomatic = null;
        if(automatic != null) {
            if(automatic.equalsIgnoreCase("true")) {
                System.out.println("if automatic !null " + automatic + " " + isAutomatic);
                isAutomatic = true;
            }
            else if(automatic.equalsIgnoreCase("false")) {
                isAutomatic = false;
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("Invalid boolean for automatic: " + automatic + ". Try: true or false");

            }
        }

        // Success will return buses which is of type BusResponseDTO
        List<BusResponseDTO> buses = busService.getBusesByFilters(
                series != null ? series.toUpperCase() : null,
                engine != null ? engine.toUpperCase() : null,
                isInProduction,
                isAutomatic);

        return ResponseEntity.ok(buses);
    }
}
