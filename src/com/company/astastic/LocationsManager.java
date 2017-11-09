package com.company.astastic;

public class LocationsManager {
    private static final int LOCATIONS_AMOUNT = 10;
    private FleetManager[] locations = new FleetManager[LOCATIONS_AMOUNT];
    private int fleetsAmount = 0;

    public void removeLastFleet() {
        locations[fleetsAmount--] = null;
    }

    public void addNewFleet() {
        locations[fleetsAmount++] = new FleetManager();
    }
}
