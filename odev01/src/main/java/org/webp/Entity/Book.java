package org.webp.entity;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long Id;

    @NotBlank
    @Size(max=50)
    private String BookName;


    @ManyToOne @NotNull
    private BookAuthor parent;

    public Book() {
    }

    public BookAuthor getParent() {
        return parent;
    }

    public void setParent(BookAuthor parent) {
        this.parent = parent;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = Id;
    }

    public String getBookName() {
        return name;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }
}