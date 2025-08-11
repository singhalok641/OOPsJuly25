package org.example.ExceptionHandling;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args) {
        try {
            ExceptionDemo.find(5, null);
        }

        catch (FileNotFoundException e) {
            System.out.println("File not found! I can some filename");
        }
        catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }

    }
}
