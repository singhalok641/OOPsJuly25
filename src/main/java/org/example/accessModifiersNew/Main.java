package org.example.accessModifiersNew;

import org.example.Student;
import org.example.accessModifiers.StudentSst;

public class Main {
    public static void main(String[] args) {
        StudentSst rohit = new StudentSst();
        rohit.rollNo = 1;
//        rohit.course  - default is package private
//        rohit.batchId  - protected does not work from a diff package


    }
}
