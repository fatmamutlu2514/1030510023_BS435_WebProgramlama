package org.webp.ejb;


import org.webp.Entity.BookCategory;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class BookCategoryEjb {

    @PersistenceContext
    private EntityManager entityManager;

    public BookCategoryEjb(){}

    public BookCategory getBookCategory(long bookCategoryId){
        BookCategory bookCategory = entityManager.find(BookCategory.class,bookCategoryId);

        return bookCategory ;
    }
}
