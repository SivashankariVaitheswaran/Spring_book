package com.example.demo.Controller;

import com.example.demo.Model.Books;
import com.example.demo.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/booksapp")
public class BookController
{
    @Autowired
    BookService bookService;
    @PostMapping("/postbook")
    public Books createBooks(@Valid @RequestBody Books books)
    {
     return bookService.save(books);
    }
    @GetMapping("/getbook")
    public Optional<Books> getBooks(Long id)
    {
     return bookService.findById(id);
    }
    @DeleteMapping("/deletebook")
    public Books deleteById(Long id)
    {
        bookService.deleteById(id);
        return null;
    }
}
