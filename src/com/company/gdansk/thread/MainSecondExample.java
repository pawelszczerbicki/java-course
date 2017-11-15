package com.company.gdansk.thread;

public class MainSecondExample {

    private static Integer counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                increment2();
            }
        };

        Thread t = new Thread(r);
        t.start();

        Thread t2 = new Thread(r);
        t2.start();

        t.join();
        t2.join();

        System.out.println("finish: " + counter);
    }


    public static synchronized void increment2() {
        counter++;
        System.out.println("counter: " + counter);
    }
}
