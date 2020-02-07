package com.hoby.controller;

import com.hoby.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


// /books로 GET요청시 현재 BookService 클래스에 책 목록을 요청하여
// 'bookList'라는 키값으로 데이터를 넘기는 컨트롤러.
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String getBookList(Model model) {
        model.addAttribute("bookList", bookService.getBookList());
        return "book";
    }
}
