package org.example.libraryManagement;

public abstract class User {
    private static int idCounter = 0;
    private final String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers = 0;

    public User() {
        this.userId = generateUniqueId();
        totalUsers++;
    }

    public User(String name, String contactInfo) {
        this.userId = generateUniqueId();
        this.name = name;
        this.contactInfo = contactInfo;
        totalUsers++;
    }

    public User(User other) {
        this.userId = other.userId;
        this.name = other.name;
        this.contactInfo = other.contactInfo;
        totalUsers++;
    }

    private String generateUniqueId() {
        return String.valueOf(idCounter++);
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }

    public abstract void displayDashboard();
    public  abstract boolean canBorrowBooks();
}
