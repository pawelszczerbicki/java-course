package com.company.gdansk.lists;

public class MyArrayList {
    private static final int INIT_SIZE = 10;
    private String[] elements = new String[INIT_SIZE];
    private int size = 0;

    public void add(String e) {
        ensureCapacity();
        elements[size] = e;
        size++;
    }

    private void ensureCapacity() {
        if(size < elements.length) return;

        String[] copy = new String[elements.length * 2];

        System.arraycopy(elements, 0, copy, 0, elements.length);
        elements = copy;
    }

    public int size() {
        return size;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++)
            if (elements[i] == o) return i;
        throw new IllegalArgumentException("Element not in list");
    }

    public String get(int i) {
        if (i > size())
            throw new IndexOutOfBoundsException();
        return elements[i];
    }

    public String remove(int i) {
        return null;
    }
}
