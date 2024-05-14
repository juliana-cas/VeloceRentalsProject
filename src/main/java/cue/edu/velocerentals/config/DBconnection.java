package cue.edu.velocerentals.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {

    private static  String url = "jdbc:mysql://localhost:3306/alquilervehiculos";
    private static  String user = "root";
    private static String password = "admin";

    public  static Connection getInstance() throws SQLException{
        return DriverManager.getConnection(url, user,password);
    }
}
