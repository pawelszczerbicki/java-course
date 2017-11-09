package com.company.astastic;

public class Gui {
    public void display() {
        LocationsManager manager = new LocationsManager();
        System.out.println("Welcome in fleet manager");
        System.out.println("Put 1 to add a new location");

        //wczytywamnie danych
        //KTOS WCISNAL 1;

        int choice = 1;
        switch (choice) {
            case 1:
                manager.addNewFleet();
                break;
            case 2:
                manager.removeLastFleet();
                break;
        }
    }
}
