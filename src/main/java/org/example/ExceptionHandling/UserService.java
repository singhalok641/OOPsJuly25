package org.example.ExceptionHandling;


public class UserService {
    /*
    throw in the case of unchecked exceptions is used to fail fast for invalid input
     */
    public void changeEmail(String userId, String newEmail) {
        if(userId == null || userId.isBlank()) {
            throw new IllegalArgumentException("userId must not be empty"); // unchecked exception
        }
        if(newEmail == null || !newEmail.contains("@")) {
            throw new IllegalArgumentException("Invalid email format");
        }

        // update the email
    }
}

