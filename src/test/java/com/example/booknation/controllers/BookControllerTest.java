package com.example.booknation.controllers;

import com.example.booknation.models.Book;
import com.example.booknation.repository.BookRepository;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

public class BookControllerTest {

    private BookController bookControllerUnderTest;

    @BeforeMethod
    public void setUp() {
        bookControllerUnderTest = new BookController();
        bookControllerUnderTest.bookRepository = mock(BookRepository.class);
    }

    @Test
    public void testGetBooks() {
        // Setup
        // Configure BookRepository.findAll(...).
        final List<Book> books = List.of(new Book("name", "author", 0.0, "description", "coverPhoto"));
        when(bookControllerUnderTest.bookRepository.findAll()).thenReturn(books);

        // Run the test
        final List<Book> result = bookControllerUnderTest.getBooks();

        // Verify the results
        Assert.assertEquals(books,result);
    }

    @Test
    public void testGetBooks_BookRepositoryReturnsNoItems() {
        // Setup
        when(bookControllerUnderTest.bookRepository.findAll()).thenReturn(Collections.emptyList());

        // Run the test
        final List<Book> result = bookControllerUnderTest.getBooks();

        // Verify the results
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void testSearchBooks() {
        // Setup
        // Configure BookRepository.findByNameContaining(...).
        final List<Book> books = List.of(new Book("name", "author", 0.0, "description", "coverPhoto"));
        when(bookControllerUnderTest.bookRepository.findByNameContaining("name")).thenReturn(books);

        // Run the test
        final List<Book> result = bookControllerUnderTest.searchBooks("name");

        // Verify the results
        Assert.assertEquals(books,result);
    }

    @Test
    public void testSearchBooks_BookRepositoryReturnsNoItems() {
        // Setup
        when(bookControllerUnderTest.bookRepository.findByNameContaining("name")).thenReturn(Collections.emptyList());

        // Run the test
        final List<Book> result = bookControllerUnderTest.searchBooks("name");

        // Verify the results
        assertEquals(Collections.emptyList(), result);
    }
}
