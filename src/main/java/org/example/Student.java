package org.example;

public class Student {
    // attributes of the com.scaler.oopsJuly.Student class
    String name;
    int id;
    String email;
    String course;

    // Behaviours of the student class
    void registerForCourse(String newCourse) {
        this.course = newCourse;
        System.out.println(name + "has registered for the course:" + course);
    }

    void submitAssignment(String assignmentTitle) {
        System.out.println(name + "has submitted the assignment:" + assignmentTitle);
    }

    void displayDetails() {
        System.out.println("com.scaler.oopsJuly.Student Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
    }
}
