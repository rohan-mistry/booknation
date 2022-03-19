package com.example.booknation;

import com.example.booknation.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.booknation.models.Book;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BooknationApplication {
	public static void main(String[] args) {
		SpringApplication.run(BooknationApplication.class, args);
		ApplicationContext context =  SpringApplication.run(BooknationApplication.class, args);
		BookRepository repos = context.getBean(BookRepository.class);
		repos.save(new Book("The monk who sold his ferrari","Robin Sharma",153.45,"this is a description","https://images-na.ssl-images-amazon.com/images/I/61Iz2yy2CKL.jpg"));
		repos.save(new Book("Harry Potter","J.K.Rowling",306.34,"this is a ddescriptkon","https://images-na.ssl-images-amazon.com/images/I/61Iz2yy2CKL.jpg"));
		repos.save(new Book("The Alchemist","Paulo Coehlo",115.34,"this is a descrtore","https://images-na.ssl-images-amazon.com/images/I/61Iz2yy2CKL.jpg"));
	}

}
