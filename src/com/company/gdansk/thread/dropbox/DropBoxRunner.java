package com.company.gdansk.thread.dropbox;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DropBoxRunner {

    private ExecutorService executor;
    public DropBoxRunner(int threads) {
        executor = Executors.newFixedThreadPool(threads);
    }

    public void run() {
        //java listen to directory changes

        List<String> files = new ArrayList<>();
        for (String file : files) {
            executor.submit(new FileSender(file));
        }

    }
}
