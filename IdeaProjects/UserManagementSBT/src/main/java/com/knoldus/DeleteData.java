package com.knoldus;
import java.util.Scanner;
import java.sql.*;

public class DeleteData {
    public static void delete()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an your id: ");
        int ID = input.nextInt();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","testuser","test123");
            Statement stmt = connection.createStatement();

            // Deleting from database
            String q1 = "DELETE from user_info WHERE ID = '" + ID +"'";

            int x = stmt.executeUpdate(q1);

            if (x > 0)
                System.out.println("One User Successfully Deleted");
            else
                System.out.println("ERROR OCCURED :(");

            connection.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
