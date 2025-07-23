package org.example.constructors.copyConstructors.Student;

public class Student {
    private String name;
    private int age;

    // parameterised/manual constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    public Student(Student other) {
        this.age = other.age;
        this.name = other.name;
    }

    // default cons
    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
