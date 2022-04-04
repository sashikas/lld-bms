package com.bookmyshow.core.model;

public enum MAPAARating {
    GeneralAudience("G"),
    ParentalGuidanceSuggested("PG"),
    ParentsStronglyCautioned("PG-13"),
    Restricted("R"),
    AdultsOnly("NC-17");

    private String code;
    MAPAARating(String code){
        this.code=code;

    }
}
