package com.hoby.service;

import com.hoby.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface BookService {
    List<Book> getBookList();
}
