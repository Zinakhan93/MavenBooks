package ru.Books.MavenBooks.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.Books.MavenBooks.model.Book;
import ru.Books.MavenBooks.servace.Bookservace;

import java.util.Collection;

@RestController
   @RequestMapping ("/book")
    public class BooksController {

        private final Bookservace bookservace;

        public BooksController(Bookservace bookservace) {
            this.bookservace = bookservace;
        }

        @GetMapping("{id}")//  GET  http://localhost:8080/books/23
        public ResponseEntity <Book> getBookInfo(@PathVariable long id) {
           Book book = bookservace.findBook(id);
           if (book == null){
               // return 404 not find
               return ResponseEntity.notFound().build();
           }
           return ResponseEntity.ok(book);

        }
        @GetMapping
        public ResponseEntity<Collection<Book>> getAllBooks () {
            return ResponseEntity.ok(bookservace.getAllBooks());
       }

        @PostMapping  // Post  http://localhost:8080/books
        public Book criateBook(@RequestBody Book book) {
            return bookservace.createBook(book);
        }
        @PutMapping
        public ResponseEntity <Book> aditBook (@RequestBody Book book){
             Book faundBook = bookservace.aditBook(book);
             if (faundBook == null){
                 return ResponseEntity.notFound().build();

             }
             return ResponseEntity.ok(faundBook);
        }
        @DeleteMapping ("{id}")
        public Book deleteBook (@PathVariable long id){
            return bookservace.deleteBook(id);
        }

    }






