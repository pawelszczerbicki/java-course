package com.company.gdansk.lists;

public class MyLinkedList {

    private Node first;

    public void add(String val) {
        Node node = new Node(val);
        if (first == null) {
            first = node;
            return;
        }

        Node last = first;
        while (last.next != null)
            last = last.next;
        last.next = node;
    }

    public int indexOf(String val) {
        int i = 0;
        Node current = first;
        if (first == null)
            return -1;
        do {
            if (current.val == val)
                return i;
            current = current.next;
            i++;
        } while (current.next != null);
        return i;
    }

    public boolean contains(String val) {
        return indexOf(val) >= 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void removeFirst() {
        if (first != null)
            first = first.next;
    }

    class Node {
        String val;
        Node next;

        public Node(String val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(String val) {
            this.val = val;
        }
    }
}
