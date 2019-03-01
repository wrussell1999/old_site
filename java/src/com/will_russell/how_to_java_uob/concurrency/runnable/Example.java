package com.will_russell.how_to_java_uob.concurrency.runnable;

public class Example implements Runnable {

    public static void main(String[] args) {
        Thread thread = new Thread(new Example());
        thread.start();
    }

    public void run() {
        System.out.println("Test");
    }
}