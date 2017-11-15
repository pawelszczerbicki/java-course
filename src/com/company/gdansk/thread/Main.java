package com.company.gdansk.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static int counter = 0;

    private static AtomicInteger counter2;
    public static void main(String[] args) throws Exception {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                counter2.incrementAndGet();
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
               counter2.incrementAndGet();
            }
        };

        Thread t = new Thread(r);
        t.start();
        Thread t2 = new Thread(r2);
        t2.start();
        t2.join();
        t.join();
        System.out.println(counter);
        System.out.println("finish");
    }
}
