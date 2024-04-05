package com.livinfo.backendlivinfo.services.book;

import com.livinfo.backendlivinfo.domain.book.Book;
import com.livinfo.backendlivinfo.domain.book.BookDTO;

import java.util.List;

public interface BookServiceInterface {
    Book createBook(BookDTO book);
    List<Book> getAllBooks();
}
