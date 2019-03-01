package com.will_russell.how_to_java_uob.concurrency.synchronized_data;

public class Example extends Thread {

    private SynchronizedData data;

    public static void main(String[] args) {
        SynchronizedData data = new SynchronizedData();
        for (int i = 0; i < 10; i++) {
            new Example(data);
        }
    }

    public Example(SynchronizedData data) {
        this.data = data;
        this.start();
    }

    @Override
    public void run() {
        data.set();
        System.out.println(this.getName() + ", data: " + data.get());
    }
}