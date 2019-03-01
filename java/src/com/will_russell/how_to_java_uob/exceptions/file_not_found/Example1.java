package com.will_russell.how_to_java_uob.exceptions.file_not_found;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

// Throws example which outputs ASCII values for characters
public class Example1 {

    public static void main(String[] args) throws FileNotFoundException {
        String file = "src/com/will_russell/how_to_java_uob/exceptions/file_not_found/example.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        try {
            int index = -1;
            while((index = reader.read()) != -1) {
                System.out.print(index);
            }
            index = -1;
        
            reader.close();
        } catch(Exception e) {
            System.out.println("e: " + e);
        }
    }
}

/**
 * BufferedReader gets the ascii value for the current character
 */