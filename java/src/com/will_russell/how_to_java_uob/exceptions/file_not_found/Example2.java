package com.will_russell.how_to_java_uob.exceptions.file_not_found;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

// Throws example which outputs characters
public class Example2 {

    public static void main(String[] args) throws FileNotFoundException {
        String file = "src/com/will_russell/how_to_java_uob/exceptions/file_not_found/example.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        try {
            int index = -1;
            while ((index = reader.read()) != -1) {
                System.out.print((char) index);
            }
            index = -1;

            reader.close();
        } catch (Exception e) {
            System.out.println("e: " + e);
        }
    }
}
