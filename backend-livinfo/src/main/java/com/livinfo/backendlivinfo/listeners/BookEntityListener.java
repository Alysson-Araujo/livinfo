package com.livinfo.backendlivinfo.listeners;

import com.livinfo.backendlivinfo.domain.book.Book;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.util.Date;

public class BookEntityListener {
    @PrePersist
    public void prePersist(Book book) {
        Date currentDate = new Date();
        book.setCreatedAt(currentDate);
        book.setUpdatedAt(currentDate);
    }
    @PreUpdate
    public void preUpdate(Book book) {
        book.setUpdatedAt(new Date());
    }


}
