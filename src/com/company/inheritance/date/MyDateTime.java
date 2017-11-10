package com.company.inheritance.date;

public class MyDateTime extends MyDate {
    int hour;
    int minute;


    public MyDateTime(int day, int year, int month, int hour, int minute) {
        super(day, year, month);
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
}
