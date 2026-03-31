package com.ZainRehman.libraryapp.Controller;

import com.ZainRehman.libraryapp.Models.book;
import com.ZainRehman.libraryapp.Service.BookManager;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;

@RestController
public class BookController {

    private BookManager manager = new BookManager();

    @GetMapping("/books")
    public ArrayList<book> getBooks() {
        return manager.getLibrary();
    }

    @PostMapping("/createBook")
    public void createBook(@RequestBody book newBook){
        manager.addBook(newBook);
    }

    @DeleteMapping("/books/{name}")
    public void deleteBook(@PathVariable String name){
        manager.removeBook(name);
    }

}