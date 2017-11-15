package com.company.gdansk.thread;

public class IncrementRunnable implements Runnable {

    private int counter;

    public IncrementRunnable(int counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter = counter + 1;
    }
}
