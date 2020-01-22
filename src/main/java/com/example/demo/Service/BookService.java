package com.example.demo.Service;

import com.example.demo.Model.Books;
import com.example.demo.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Service
public class BookService
{
    @Autowired
    BookRepository bookRepository;
    public Books save(Books book)
    {
        return bookRepository.save(book);
    }
    //search
    public List<Books> findAll()
    {
        return bookRepository.findAll();
    }
    //delete
    public Books deleteById(Long id)
    {
        bookRepository.deleteById(id);
        return null;
    }
    //get employee by id
    public Optional<Books> findById(Long id)
    {
        return bookRepository.findById(id);
    }

}
