package com.company.gdansk.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        for (String name : names) {
            System.out.println(name);
        }

        Iterator<String> namesIterator = names.iterator();

        String name;
        while(namesIterator.hasNext()){
            name = namesIterator.next();
            System.out.println(name);
            if(name.startsWith("a"))
                namesIterator.remove();
        }
    }
}
