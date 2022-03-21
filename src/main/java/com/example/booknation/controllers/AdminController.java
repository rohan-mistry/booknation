package com.example.booknation.controllers;
import com.example.booknation.models.Book;
import com.example.booknation.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdminController {

    @Autowired
    private BookRepository bookRepo;

    @GetMapping("/admin")
    public String adminView(Model model) {
        model.addAttribute("book", new Book());
        return "admin";
    }

    @GetMapping("/create_success")
    public String creationSuccess(Model model) {
        return "create_success";
    }

    @PostMapping("/create_book")
    public String createBook(@ModelAttribute("book") Book book) {
        bookRepo.save(book);
        return "redirect:/create_success";
    }
}
