package com.company.gdansk.composition;

public class MyDateTime extends MyDate {
    private int hour;
    private int minute;

    public MyDateTime(int day, int month, int year,
                      int hour, int minute) {
        super(day, month, year);
        this.hour = hour;
        this.minute = minute;
    }
}
