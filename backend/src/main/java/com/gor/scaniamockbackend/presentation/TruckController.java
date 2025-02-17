package com.gor.scaniamockbackend.presentation;

import com.gor.scaniamockbackend.dto.TruckResponseDTO;
import com.gor.scaniamockbackend.utility.SearchQueryValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.gor.scaniamockbackend.application.TruckService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/trucks")
public class TruckController {


    @Autowired
    private TruckService truckService;

    @GetMapping
    public ResponseEntity<?> getTrucksByFilters(
            @RequestParam(required = false) String series,
            @RequestParam(required = false) String engine,
            @RequestParam(required = false) String production,
            @RequestParam(required = false) String automatic) {
        // Using <?> because response can be of different type

        // Error will return a String
        if (series != null && !SearchQueryValidator.isValidTruckSeries(series)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Invalid series: " + series + ". Try: " + SearchQueryValidator.getValidTruckSeries());
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

        // Success will return trucks which is of type TruckResponseDTO
        List<TruckResponseDTO> trucks = truckService.getTrucksByFilters(
                series != null ? series.toUpperCase() : null,
                engine != null ? engine.toUpperCase() : null,
                isInProduction,
                isAutomatic);

        return ResponseEntity.ok(trucks);
    }
}
