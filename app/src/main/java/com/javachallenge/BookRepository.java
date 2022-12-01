package com.javachallenge;

import java.sql.*;

public class Jdbc {

    public static Connection getConnection() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookdb", "user", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }

    public Jdbc() {}

    public static Book parseIntoBook() {
        Book book = null;
        Statement statement;
        ResultSet resultSet;
        Connection connection = getConnection();

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM books");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                String author = resultSet.getString("author");
                int pages = resultSet.getInt("pages");
                float price = resultSet.getFloat("price");
                book = new Book(id, title, author, pages, price);

                // need to stop the loop before it runs entire DB
                return book;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return book;
    }


}
