package com.mostafa.service;

import com.mostafa.entity.Book;
import com.mostafa.excption.NotFoundException;

import java.util.List;

/**
 * @author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @File com.mostafa.service.BookService.java: SpringBootJUnitMockito-TDD
 * @CreationDate 10/2/2022 12:36 PM
 */
public interface BookService {
    public List<Book> findAllBooks() throws NotFoundException;
    public Book findBookById(long id) throws NotFoundException;
    public Book saveBook(Book book);
    public Book updateBook(Book book) throws NotFoundException;
    public void deleteBook(Book book) throws NotFoundException;
}
