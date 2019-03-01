package com.will_russell.how_to_java_uob.exceptions.arithmetic;

public class Example1 {

    public static void main(String[] args) {
        try {
            int value = 10 / 0;
        } catch(ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }
    }
}