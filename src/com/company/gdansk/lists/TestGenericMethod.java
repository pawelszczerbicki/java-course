package com.company.gdansk.lists;

import java.util.List;

public class TestGenericMethod {

    public <T> T getElement(List<T> elements, int pos) {
         return elements.get(pos);
    }

    public <T> int getPosition(List<T> elements, T element) {
        for (int i = 0; i < elements.size(); i++) {
            if(elements.get(i) == element) return i;
        }
        return -1;
    }
}
