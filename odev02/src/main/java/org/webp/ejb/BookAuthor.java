package org.webp.ejb;


import org.webp.Entity.BookAuthor;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.validation.constraints.NotNull;

@Stateless
public class BookAuthorEjb {

    @PersistenceContext
    private EntityManager entityManager;

    public BookAuthorEntity(){}


    public BookAuthor
getBookAuthor(long bookAuthorId){
        BookAuthor bookauthor = entityManager.find(BookAuthor.class,bookAuthorId);

        return bookauthor ;
    }
}
