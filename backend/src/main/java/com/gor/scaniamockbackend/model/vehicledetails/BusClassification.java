package com.gor.scaniamockbackend.model.vehicledetails;

public class BusClassification {

    public enum BusSeries {
        FENCER,
        TOURING,
        IRIZAR,
        OMNILINE,
        CITYWIDE,
        INTERLINK,
        OMNICITY,
        OMNILINK,
        OMNIEXPRESS,
        METROPOL,
        CAPITOL,
        MAXCI,
        METROLINK,
        L,
        K,
        N,
        CF,
    }

    public enum BusModel {
        // Citywide
        LF,
        LE,
        L113,

        // Interlink
        LD,
        MD,
        HD,


        // Fencer
        F1,
        F6,

        // OmniExpress
        V3_20,
        V3_40,
        V3_60,

        // K-Series
        K250,
        K280,
        K320,
        K360,
        K400,
        K450,

        // N-Series
        N113,
        N230UB,
        N280UB,
        N310UA,

        // OmniLink
        LINK_12M,
        LINK_18M,

        // OmniCity
        CITY_12M,
        CITY_18M,
        DOUBLE_DECKER,
        ARTICULATED,
        L12,
        L18,
        L13,
        I4,
        // OmniLine
        LINE_12M,
        LINE_13_7M,

        // MetroLink
        LINK_HD,
        LINK_13_7M,
        LINK_14_5M,

        // Capitol
        C70,
        C75,
        C76,

        // Metropol
        C50,

        // CF Series
        CF65,
        CF75,
        CF110,

        // MaxCi
        CN113CLL
    }
}
