package com.company.gdansk;

public enum Month {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5);

    int number;


    Month(int number) {
        this.number = number;
    }


    public static Month getByNumber(int number) {
        Month[] values = Month.values();

        for (Month current : values) {
            if (current.number == number)
                return current;
        }
        throw new IllegalArgumentException("No enum with " + number);
    }
}
