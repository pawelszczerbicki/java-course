package com.company.inheritance.date;

public class MyDate {

    private int day;
    private int year;
    private int month;

    public MyDate(int day, int year, int month) {
        this.day = day;
        this.year = year;
        this.month = month;
    }


    public void nextMonth(){

    }

    public void nextDay(){

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
