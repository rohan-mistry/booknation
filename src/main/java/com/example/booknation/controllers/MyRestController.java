package com.example.booknation.controllers;
import com.example.booknation.models.Book;
import com.example.booknation.models.User;
import com.example.booknation.repository.BookRepository;
import com.example.booknation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/book")
public class MyRestController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/getBooks")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/getBookById/{id}")
    public Book getBookById(@PathVariable Long id){
            return bookRepository.findById(id).get();
        }
}
