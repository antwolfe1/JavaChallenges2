package com.javachallenge;

import java.io.Serializable;
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
        return allBooks;
    }

    private static ArrayList<Book> BookToArraylist(Book book) {
        ArrayList<Book> arrayList = new ArrayList<>();
        arrayList.add(book);
        return arrayList;
    }

    private static HashMap<Integer, Book> BookToHashmap(Book book) {
        HashMap<Integer, Book> map = new HashMap<>();
        int id = book.getId();
        map.put(id, book);
        return map;
    }
}
