package com.company.gdansk.immutable;

public class TimeImmutable {
    private int hour;
    private int minute;

    public TimeImmutable(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public TimeImmutable nextHour() {
        return new TimeImmutable(hour + 1, minute);
    }

    public int getHour() {
        return hour;
    }
}
