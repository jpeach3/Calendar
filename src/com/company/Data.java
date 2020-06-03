package com.company;
import java.sql.*;

public class Data {

    public static void connect() throws Exception {

        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://24.196.52.166:3306/testdb";
            String username = "username";
            String password = "password";
            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

