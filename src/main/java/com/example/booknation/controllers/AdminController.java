package com.example.booknation.controllers;
import com.example.booknation.models.Book;
import com.example.booknation.payload.response.MessageResponse;
import com.example.booknation.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private BookRepository bookRepo;

    @PostMapping("/book/create")
    public ResponseEntity<?> registerBook(@Valid @RequestBody Book book) {
        bookRepo.save(book);
        return ResponseEntity.ok(new MessageResponse("Book created successfully"));
    }
}
