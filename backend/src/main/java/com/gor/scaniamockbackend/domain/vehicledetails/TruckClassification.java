package com.gor.scaniamockbackend.domain.vehicledetails;

public class TruckClassification {

    public enum TruckSeries {
        P_SERIES,
        G_SERIES,
        R_SERIES,
        S_SERIES,
        L_SERIES,
        XT_RANGE
    }

    public enum TruckModel {
        // P-Series
        P280, P320, P360, P410, P450, P500, P540,

        // G-Series
        G320, G360, G410, G450, G500, G540, G560,

        // R-Series
        R410, R450, R500, R540, R580, R620, R660, R730,

        // S-Series
        S450, S500, S540, S580, S650, S730, S770, S800,

        // L-Series
        L280, L320, L340, L360, L380, L400, L440, L480,

        // XT-Series (Heavy-duty off-road)
        XT360, XT400, XT450, XT500, XT560, XT620
    }

}
