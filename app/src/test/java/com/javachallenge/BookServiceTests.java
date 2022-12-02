package com.javachallenge;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class BookServiceTests {

    @Test
    public void test_getAllBooksAsList_returnsBook() {
        Book expected = BookRepository.getInstance().getAllBooks().get(0);
        List<Book> actual = BookService.getAllBooksAsList();
    }

    @Test
    public void test_getAllBooksAsMap_returnsMapOfTableRows() {

    }
}