package com.livinfo.backendlivinfo.domain.book;


import com.livinfo.backendlivinfo.listeners.BookEntityListener;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity(name = "books")
@Table(name = "books")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@EntityListeners(BookEntityListener.class)
public class Book {

    public Book(BookDTO dto){
        this.title = dto.title();
        this.author = dto.author();
        this.genres = dto.genres();
        this.synopsis = dto.synopsis();
        this.coverBook = dto.coverBook();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String author;

    private String genres;

    private String synopsis;

    private String coverBook;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", updatable = false)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt;

}