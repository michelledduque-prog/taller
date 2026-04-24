package com.uniajc.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionPostgresDatabase {

    private static final String URL = "jdbc:postgresql://localhost:5433/universidad";
    private static final String USER = "postgres";
    private static final String PASSWORD = "12345";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }
}
