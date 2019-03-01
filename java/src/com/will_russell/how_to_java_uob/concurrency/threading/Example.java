package com.will_russell.how_to_java_uob.concurrency.threading;

public class Example extends Thread {

    public static void main(String[] args) {
        Example example = new Example();
        example.start();
    }
    
    public void run() {
        System.out.println("Test");
    }
}