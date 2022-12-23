package org.webp.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BookAuthor {

    @Id
    @GeneratedValue
    private Long Id;

    @NotBlank
    @Size(max=50)

    private String AuthorName;

    private int BookCount;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Book> Books;

    public Book() {
        books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = Id;
    }

    public String getAuthorName() {
        return name;
    }

    public void setAuthorName(String AuthorName) {
        this.AuthorName = authorName;
    }

    public void getBookCount() {
       return BookCount;
    }

    public void setBookCount(int BookCount) {
        this.BookCount = BookCount;
    }
}