package model.dao;

import java.sql.*;

public class ConnectionFactory{
    
    public ConnectionFactory() throws ClassNotFoundException{
        Class.forName("com.msql.jdbc.Driver");
    }
    
    public Connection openConnection() throws SQLException{
        String url = "jdbc:mysql://localhost/eduvale";
        return DriverManager.getConnection(url, "root", "");
    }
    
}