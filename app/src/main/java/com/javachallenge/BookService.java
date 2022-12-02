package com.javachallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookService {


// TODO: getAllBooksAsMap && getAllBooksAsList

//    public static Serializable getAllBooks(String collectionType) {
//        Book book = BookRepository.getAllBooks();
//        if (collectionType.equalsIgnoreCase("map")) {
//            return BookToHashmap(book);
//        }
//        if (collectionType.equalsIgnoreCase("arraylist")) {
//            return BookToArraylist(book);
//        }
//        return null;
//    }

    public static List<Book> getAllBooks() {
        List<Book> allBooks = BookRepository.getInstance().getAllBooks();
        System.out.println(allBooks);
        return allBooks;
    }

    public static List<Book> getAllBooksAsList() {
        ArrayList<Book> allBooks = new ArrayList<>();
        List<Book> bookRepoReturns = BookRepository.getInstance().getAllBooks();
        for (Book book : bookRepoReturns) {
            allBooks.add(book);
        }
        return allBooks;
    }


    public static HashMap<Integer, Book> getAllBooksAsMap(Book book) {
        HashMap<Integer, Book> map = new HashMap<>();
        int id = book.getId();
        map.put(id, book);
        return map;
    }
}
