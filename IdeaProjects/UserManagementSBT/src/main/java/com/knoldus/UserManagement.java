/*package com.knoldus;

import java.sql.*;

public class UserManagement {
    public static void main(String args[]) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "testuser", "test123");
            if (connection != null) {
                System.out.println("connection success");
            } else {
                System.out.println("connection failed");
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
*/