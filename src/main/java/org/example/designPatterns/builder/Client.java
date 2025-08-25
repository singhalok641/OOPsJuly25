package org.example.designPatterns.builder;

public class Client {
    public static void main(String[] args) {
        Student.Builder builder = Student.getBuilder();
        builder.setAge(12);
        builder.setName("Jitendra");
        builder.setGradYear(2021);

//        Student jitendra = new Student(builder);

//        Student student = new Student(builder);

        Student jitendra = builder.build();

        // Production Builder code
        Student st1 = Student.getBuilder()
                .setAge(12)
                .setName("Justine")
                .setGradYear(2021)
                .setPhoneNumber("819497492")
                .build();

        System.out.println("DEBUG");
    }
}
