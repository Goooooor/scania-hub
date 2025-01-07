package com.gor.scaniamockbackend.utility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SearchQueryValidator {

    private static final List<String> VALID_TRUCK_SERIES = Arrays.asList("L_SERIES", "P_SERIES", "G_SERIES", "R_SERIES", "S_SERIES", "XT_RANGE");
    private static final List<String> VALID_ENGINES = Arrays.asList("DIESEL", "GAS", "ELECTRIC");
    private static final List<String> VALID_BUS_SERIES = Arrays.asList(
            "FENCER",
            "TOURING",
            "IRIZAR",
            "OMNILINE",
            "CITYWIDE",
            "INTERLINK",
            "OMNICITY",
            "OMNILINK",
            "OMNIEXPRESS",
            "METROPOL",
            "CAPITOL",
            "MAXCI",
            "METROLINK",
            "K_SERIES",
            "N_SERIES",
            "CF_SERIES"
    );

    public static boolean isValidTruckSeries(String model) {
        return VALID_TRUCK_SERIES.contains(model.toUpperCase());
    }

    public static List<String> getValidTruckSeries() {
        return VALID_TRUCK_SERIES;
    }

    public static boolean isValidBusSeries(String model) {
        return VALID_BUS_SERIES.contains(model.toUpperCase());
    }

    public static List<String> getValidBusSeries() {
        return VALID_BUS_SERIES;
    }

    public static boolean isValidEngine(String engine) {
        return VALID_ENGINES.contains(engine.toUpperCase());
    }

    public static List<String> getValidEngines() {
        return VALID_ENGINES;
    }
}
