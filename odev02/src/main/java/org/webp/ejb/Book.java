package org.webp.ejb;

import org.webp.Entity.Book
import org.webp.Entity.BookAuthor
import org.webp.Entity.BookCategory

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;


@Stateless
public class BookEjb {

    @PersistenceContext
    private EntityManager entityManager;

    public BookEjb(){}

    public void addBook(String bookName, int bookCategoryId, int bookAuthorId){
        BookCategoryEjb bookCategoryejb = new BookCategoryEjb ();
        BookCategory bookCategory = categoryEjb.getBookCategory(bookCategoryId);

        BookAuthorEjb bookAuthorejb = new BookAuthorEjb ();
        BookAuthor bookAuthor = bookAuthorejb .getBookAuthor(bookAuthorId);

        Book book = new Book();
        book.setBookName(bookName);
        
       
        book.setBookAuthor(bookAuthor);
        

        entityManager.persist(book);
    }

      
}
