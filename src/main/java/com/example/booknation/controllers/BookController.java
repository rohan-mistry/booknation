package com.example.booknation.controllers;

import com.example.booknation.models.Book;
import com.example.booknation.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/book")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @GetMapping("/getBooks")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam String name) {
        return bookRepository.findByNameContaining(name);
    }
    @GetMapping("/getBookById/{id}")
    public Book getBookById(@PathVariable Long id){
            return bookRepository.findById(id).get();
        }
}