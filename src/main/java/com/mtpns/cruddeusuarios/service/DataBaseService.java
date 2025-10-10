package com.mtpns.cruddeusuarios.service;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseService {
    private static final Dotenv dotenv = Dotenv.load();
    private static final String URL = dotenv.get("DB_URL");
    private static final String USER = dotenv.get("DB_USER");
    private static final String PASSWORD = dotenv.get("DB_PASSWORD");

    public static Connection getConnection()throws SQLException {
        if (URL == null || USER == null || PASSWORD == null){
            throw new SQLException("Credências não foram encontradas no .env");
        }
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }

    public static boolean testarConexao(){
        try(Connection conn = getConnection()){
            return conn != null;
        }catch (SQLException e){
            return false;
        }
    }
}
