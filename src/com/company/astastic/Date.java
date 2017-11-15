package com.company.astastic;

public class Date {
    private int year;
    private int month;

    public void nextMonth() {
        if (month == 12) {
            month = 1;
            nextYear();
        } else month++;
    }

    public void nextYear(){
        year++;
    }
}
