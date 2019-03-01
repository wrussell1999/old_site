package com.will_russell.how_to_java_uob.concurrency.synchronized_data;

public class SynchronizedData {
    private int value;

    public synchronized void set() {
        value++;
    }

    public synchronized int get() {
        return value;
    }
}