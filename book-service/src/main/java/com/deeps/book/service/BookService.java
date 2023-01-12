package com.deeps.book.service;



import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deeps.book.entity.Book;
import com.deeps.book.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book savebook(Book book) {
    	System.out.println("Inside Book Save Method" + book);
        return bookRepository.save(book);
    }

    public Book findBookById(Long bookId) {
        System.out.println("Inside findBookById method. Id =" +bookId);
        return bookRepository.findByBookId(bookId);
    }
}
