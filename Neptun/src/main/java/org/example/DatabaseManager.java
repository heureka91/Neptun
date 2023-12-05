package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:h2:tcp://localhost/~/test";
    private static final String USER = "sa";
    private static final String PASS = "";

    public static void initializeDB() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS LESSONS (" +
                "ID INT AUTO_INCREMENT PRIMARY KEY, " +
                "LESSON VARCHAR(255), " +
                "START TIME, " +
                "FINISH TIME, " +
                "STUDENT VARCHAR(255), " +
                "GRADE INT);";
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(createTableSQL);
            System.out.println("Table 'LESSONS' has been created.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
