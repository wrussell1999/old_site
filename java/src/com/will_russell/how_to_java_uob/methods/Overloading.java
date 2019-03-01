package com.will_russell.how_to_java_uob.methods;

public class Overloading {

    public static void main(String[] args) {

        // Function
        System.out.println(functionExample(3, 4));
        System.out.println(functionExample("3", "4"));

        // Procedure
        procedureExample(3, 4);
        procedureExample(3, 4, 5);
        
    }

    private static int functionExample(int a, int b) {
        return a * b;
    } 

    private static int functionExample(String a, String b) {
        int newA = new Integer(a);
        int newB = new Integer(b);
        return newA * newB;
    }

    private static void procedureExample(int a, int b) {
        int total = a + b;
        System.out.println("Total: " + total);
    }

    private static void procedureExample(int a, int b, int c) {
        int total = a + b + c;
        System.out.println("Total: "  + total);
    } 

}