package com.javachallenge;

import java.util.ArrayList;
import java.util.HashMap;

public class DbChallenges {


    public static void BookToCollection(String collectionType) {
        Book book = Jdbc.parseIntoBook();
        if (collectionType.equalsIgnoreCase("map")) {
            BookToHashmap(book);
        }
        if (collectionType.equalsIgnoreCase("arraylist")) {
            BookToArraylist(book);
        }
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
