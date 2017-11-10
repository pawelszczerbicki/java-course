package com.company.inheritance.date.composition;

public class MyDateTimeCompos {

    private MyDateCompos date;
    private int hour;
    private int minute;

    public MyDateTimeCompos(int month, int year, int day, int hour, int minute) {
        date = new MyDateCompos(month, year, day);
        this.hour = hour;
        this.minute = minute;
    }

    public MyDateTimeCompos(MyDateCompos date, int hour, int minute) {
        this.date = date;
        this.hour = hour;
        this.minute = minute;
    }
}
