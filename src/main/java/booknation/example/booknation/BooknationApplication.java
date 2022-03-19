package booknation.example.booknation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BooknationApplication implements CommandLineRunner {
	@Autowired
	BookRepository repos;
	public static void main(String[] args) {
		SpringApplication.run(BooknationApplication.class, args);
	}
	@Override
	public void run(String ...args) throws Exception{
		repos.save(new Book(1,"The monk who sold his ferrari","Robin Sharma",153));
		repos.save(new Book(2,"Harry Potter","J.K.Rowling",306));
		repos.save(new Book(3,"The Alchemist","Paulo Coehlo",115));
	}
}
