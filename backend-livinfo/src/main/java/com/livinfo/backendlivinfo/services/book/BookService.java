package com.livinfo.backendlivinfo.services.book;

import com.livinfo.backendlivinfo.domain.book.Book;
import com.livinfo.backendlivinfo.domain.book.BookDTO;
import com.livinfo.backendlivinfo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService implements BookServiceInterface {

    @Autowired
    private BookRepository repository;
    public Book createBook(BookDTO book) {
        Book newBook = new Book(book);
        this.saveBook(newBook);
        return newBook;
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(this.findAllBooks());
    }

    private void saveBook(Book book) {
        this.repository.save(book);
    }

    private List<Book> findAllBooks(){
        return this.repository.findAll();
    }
}