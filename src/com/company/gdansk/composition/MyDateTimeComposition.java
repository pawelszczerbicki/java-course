package com.company.gdansk.composition;

public class MyDateTimeComposition {

    private int hour;
    private int minute;
    private MyDate date;

    public MyDateTimeComposition(int hour, int minute, MyDate date) {
        this.hour = hour;
        this.minute = minute;
        this.date = date;
    }


    public MyDateTimeComposition(int day, int month, int year,
                                 int hour, int minute){
        this.hour = hour;
        this.minute = minute;
        this.date = new MyDate(day, month, year);

    }
}
