package booknation.example.booknation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping(path = "booknation")
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
        @Autowired
        private UserRepository userRepository;
        @GetMapping("/getUsers")
        public List<User> getUsers(){
            return userRepository.findAll();
        }
    }
