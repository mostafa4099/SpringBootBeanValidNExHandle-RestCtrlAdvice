package com.mostafa.controller;

import com.mostafa.entity.Book;
import com.mostafa.excption.NotFoundException;
import com.mostafa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.controller.BookController.java: SpringBootJUnitMockito-TDD
 * @CreationDate 10/2/2022 12:49 PM
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBookList() throws NotFoundException {
        return bookService.findAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable("id") long id) throws NotFoundException {
        return bookService.findBookById(id);
    }

    @PostMapping
    public Book saveBook(@Valid @RequestBody Book book){
        return bookService.saveBook(book);
    }

    @PutMapping
    public Book updateBook(@Valid @RequestBody Book book) throws NotFoundException {
        return bookService.updateBook(book);
    }

    @DeleteMapping
    public String deleteBook(@RequestBody Book book) throws NotFoundException {
        bookService.deleteBook(book);
        return "Deleted Successfully";
    }
}
