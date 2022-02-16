package com.minal.bookcrud2.Service;

import com.minal.bookcrud2.Entity.Books;
import com.minal.bookcrud2.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Books> saveAllBooks(List<Books> books){
        return bookRepository.saveAll(books);
    }

    public Books saveBook(Books book){
        return bookRepository.save(book);
    }

    public Books getBookByName(String bookName){
        return bookRepository.findByBookName(bookName);
    }

    public List<Books> getAllBooks(){
        return bookRepository.findAll();
    }

    public Books updateBookDetails(Books book){
        Books books = bookRepository.getById(book.getId());
        books.setBookName(book.getBookName());
        books.setAuthor(book.getAuthor());
        books.setPrice(book.getPrice());
        return bookRepository.save(books);
    }

    public String deleteBook(int id){
        bookRepository.deleteById(id);
        return "Book details removed successfully!";
    }
}
