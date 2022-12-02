package com.javachallenge;


import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BookRepository {

    private final Connection connection;


    private BookRepository() {
        try {
            connection = DriverManager.getConnection("URL", "user", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static BookRepository getInstance() {
        return new BookRepository();
    }


    public List<Book> getAllBooks() {
        Book book = null;
        Statement statement;
        ResultSet resultSet;
        List<Book> bookList = new ArrayList<>();

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
                bookList.add(book);

                // need to stop the loop before it runs entire DB
                return bookList;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }


}
