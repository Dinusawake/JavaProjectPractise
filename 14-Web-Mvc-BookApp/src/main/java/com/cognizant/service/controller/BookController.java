package com.cognizant.service.controller;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.cognizant.service.entity.BookEntity;
import com.cognizant.service.repository.BookRepository;


@Controller
public class BookController {

    @Autowired
    private BookRepository repo;

    @GetMapping("/book")
    public String getBookById(@RequestParam("id") Integer id, Model model) {
        Optional<BookEntity> findById = repo.findById(id);

        if (findById.isPresent()) {
            BookEntity bookObj = findById.get();
            model.addAttribute("book", bookObj);
        } else {
            model.addAttribute("error", "Book not found with ID: " + id);
        }

        return "index";  // returns to index.html Thymeleaf view
    }
}
