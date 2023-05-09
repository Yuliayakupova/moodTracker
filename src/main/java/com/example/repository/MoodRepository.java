//package com.example.repository;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Service;
//
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//@Service
//public class MoodRepository {
//
//    private static void createDbMoodTable() throws SQLException {
//        Connection dbConnection = null;
//        Statement statement = null;
//
//        String createTableSQL = "CREATE TABLE MOOD("
//                + "MOOD_ID NUMBER(5) NOT NULL, "
//                + "MOOD_DATE DATE NOT NULL, "
//                + "MOOD VARCHAR(20) NOT NULL, "
//                + "PILLS VARCHAR(20) NOT NULL, "
//                + "NOTE VARCHAR(300) NOT NULL, "
//                + "CREATED_DATE DATE NOT NULL, " + "PRIMARY KEY (MOOD_ID) "
//                + ")";
//
//        try {
//            dbConnection = getDBConnection();
//            statement = dbConnection.createStatement();
//
//            statement.execute(createTableSQL);
//            System.out.println("Table \"mood\" is created!");
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            if (statement != null) {
//                statement.close();
//            }
//            if (dbConnection != null) {
//                dbConnection.close();
//            }
//        }
//    }
//}
