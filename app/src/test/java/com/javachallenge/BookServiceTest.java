package com.javachallenge;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;


public class DbChallengesTest {

    @Test
    public void test_BookToMap_GivenABookObject_ReturnAMap() {
        HashMap<Integer, Book> expected = new HashMap<>();
        Book book = new Book(1, "The Thursday Murder Club", "Richard Osman", 500, 10.99f);
        expected.put(book.getId(), book);
        HashMap<Integer, Book> actual = DbChallenges.BookToCollection("hashmap");
        Assert.assertEquals(expected.keySet(), actual.keySet()); // wrong but I don't know why
    }


}