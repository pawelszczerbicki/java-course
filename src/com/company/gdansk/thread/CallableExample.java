package com.company.gdansk.thread;

import java.util.concurrent.*;

public class CallableExample {

    ExecutorService executor = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws Exception {
        new CallableExample().start();

    }

    private void start() throws Exception {
        Callable<String> call = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread());
                return "Test";
            }
        };

        Future<String> future = executor.submit(call);
        Future<String> future1 = executor.submit(call);
        Future<String> future2 = executor.submit(call);
        Future<String> future3 = executor.submit(call);
        Future<String> future4 = executor.submit(call);
        executor.submit(call);
        executor.submit(call);
        executor.submit(call);
        executor.submit(call);
        executor.submit(call);

        System.out.println("zadania rozdzielone");


        System.out.println(future.isCancelled());
        System.out.println(future.isDone());
//        String result = future.get(1, TimeUnit.SECONDS);
//        System.out.println(result);
//
//        executor.shutdown();
    }

}
