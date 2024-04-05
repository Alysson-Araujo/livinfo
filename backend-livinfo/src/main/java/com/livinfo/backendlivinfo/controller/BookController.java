package com.livinfo.backendlivinfo.controller;

import com.livinfo.backendlivinfo.domain.book.Book;
import com.livinfo.backendlivinfo.domain.book.BookDTO;
import com.livinfo.backendlivinfo.services.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {


    @Autowired
    private BookService service;
    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody BookDTO book){
        Book newUser = service.createBook(book);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> listUsers = service.getAllBooks();
        return new ResponseEntity<>(listUsers, HttpStatus.ACCEPTED);
    }
}
