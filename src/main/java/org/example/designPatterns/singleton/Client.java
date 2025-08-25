package org.example.designPatterns.singleton;

public class Client {

    public static void main(String[] args) {
        DbConnection dbConnection1 = DbConnection.instance;
        DbConnection dbConnection2 = DbConnection.instance;
        DbConnection dbConnection3 = DbConnection.instance;
        DbConnection dbConnection4 = DbConnection.instance;

        System.out.println("DEBUG");
    }
}
