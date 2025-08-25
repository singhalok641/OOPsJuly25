package org.example.designPatterns.builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String univName;
    private String batch;
    private long id;
    private int gradYear;
    private String phoneNumber;

//    public Student(String name, int age, double psp, String univName, String batch, long id, int gradYear, String phoneNumber) {
//        this.name = name;
//        this.age = age;
//        this.psp = psp;
//        this.univName = univName;
//        this.batch = batch;
//        this.id = id;
//        this.gradYear = gradYear;
//        this.phoneNumber = phoneNumber;
//    }

    // Marked this private to avoid object creation from constructor
    private Student(Builder builder) {
        this.gradYear = builder.getGradYear();
        this.age = builder.getAge();
        this.name = builder.getName();
        this.batch = builder.getBatch();
        this.id = builder.getId();
        this.psp = builder.getPsp();
        this.univName = builder.getUnivName();
        this.phoneNumber = builder.getPhoneNumber();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;
        private double psp;
        private String univName;
        private String batch;
        private long id;
        private int gradYear;
        private String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build() {
            // validation starts
            if (this.getGradYear() > 2022) {
                throw new IllegalArgumentException("Grad year cannot be greater than 2022");
            }
            // validation completes

            return new Student(this);
        }
    }
}
