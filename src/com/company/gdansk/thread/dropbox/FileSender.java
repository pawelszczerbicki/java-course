package com.company.gdansk.thread.dropbox;

public class FileSender implements Runnable{

    private String filename;

    public FileSender(String filename) {
        this.filename = filename;
    }

    @Override
    public void run() {
        //dropbox java sdk send files
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I'm sending file....");
    }
}
