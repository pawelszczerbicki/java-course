package com.company.inheritance.date.composition;

public class MyDateCompos {
    private int month;
    private int year;
    private int day;

    public MyDateCompos(int month, int year, int day) {
        this.month = month;
        this.year = year;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }
}
