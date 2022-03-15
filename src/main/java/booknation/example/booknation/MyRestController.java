package booknation.example.booknation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(path = "books")
public class MyRestController {


        @Autowired
        private BookRepository bookRepository;

        @GetMapping("/getBooks")
        public List<Book> getBooks() {
            return bookRepository.findAll();
        }

        @Autowired
        private UserRepository userRepository;
        @GetMapping("/getUsers")
        public List<User> getUsers(){
            return userRepository.findAll();
        }
    }
