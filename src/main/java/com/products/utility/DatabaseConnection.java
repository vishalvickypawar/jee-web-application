package com.products.utility;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getDatasourceConnection() throws SQLException{
        MysqlDataSource dataSource = null;
        try{
            dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/Products");
            dataSource.setUser("root");
            dataSource.setPassword("vicky");
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return dataSource.getConnection();
    }
}
