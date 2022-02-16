package com.minal.bookcrud2.Controller;

import com.minal.bookcrud2.Entity.Books;
import com.minal.bookcrud2.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/saveallbooks")
    public List<Books> saveAllBooks(@RequestBody List<Books> books){
        return bookService.saveAllBooks(books);
    }

    @PostMapping("/savebook")
    public Books saveBook(@RequestBody Books book){
        return bookService.saveBook(book);
    }

    @GetMapping("/getallbooks")
    public List<Books> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/getabook/{bookname}")
    public Books getBook(@PathVariable(value = "bookname") String bookName){
        return bookService.getBookByName(bookName);
    }

    @PutMapping("/updatebookdetails")
    public Books updateBookDetails(@RequestBody Books book){
        return bookService.updateBookDetails(book);
    }

    @DeleteMapping("/deletebook")
    public String deleteBook(@RequestParam int id){
        return bookService.deleteBook(id);
    }

}
