package org.webp.entity;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BookCategory {

    @Id
    @GeneratedValue
    private Long Id;

    @NotBlank
    @Size(max=50)
    private String CategoryName;

    @NotBlank
    @Size(max=200)
    private String Description;



    @ManyToOne @NotNull
    @Column(unique=true)
    private Book book;

    public BookCategory() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = Id;
    }

    public String getCategoryName() {
        return name;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }


    public void getDescription() {
        return Description;
    }

    public void setDescription(String Descripiton) {
        this.Descripiton = Descripiton;
    }
}