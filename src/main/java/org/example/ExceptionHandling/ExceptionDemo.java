package org.example.ExceptionHandling;

import org.example.constructors.copyConstructors.Student.Student;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {
    /*
    1. Checked: Need to be caught and declared(external errors, IO, SQL, network)
    2. Unchecked: Extends RuntimeException, logic/developer mistakes(divide by zero, NPE)
    We ideally never throw an unchecked exception
     */

    static void find(int x, Student s) throws FileNotFoundException {
        if(s != null) {
            s.setAge(23);
        }
        if(x % 2 == 0) {
            throw new ArithmeticException("Even number not allowed");
        } else if(x % 3 == 0) {
            throw new NullPointerException("Multiple of 3");
        } else if(x % 5 == 0) {
            throw new FileNotFoundException("Multiple of 5 exception!");
        }
    }
}
