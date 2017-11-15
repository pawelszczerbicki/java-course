package com.company.gdansk.compare;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    private String make;
    private String model;
    private int year;
    private int purchaseYear;

    @Override
    public int compareTo(Car o) {
        if (!make.equals(o.make))
            return make.compareTo(o.make);
        if (!model.equals(o.model))
            return model.compareTo(o.model);
        if (year != o.year)
            return year - o.year;
        return purchaseYear - o.purchaseYear;
    }

    public static final Comparator<Car> YEAR_COMPARATOR = new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
            return o1.year - o2.year;
        }
    };
}
