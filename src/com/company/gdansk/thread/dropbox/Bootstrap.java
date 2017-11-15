package com.company.gdansk.thread.dropbox;

public class Bootstrap {
    public static void main(String[] args) {
        new DropBoxRunner(10).run();
    }
}
