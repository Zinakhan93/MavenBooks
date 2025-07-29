package ru.Books.MavenBooks.servace;

import org.springframework.stereotype.Service;
import ru.Books.MavenBooks.model.Book;

import java.util.Collection;
import java.util.HashMap;
@Service
public class Bookservace {
    private final HashMap<Long, Book> books = new HashMap<>();
    private  long lastId = 0;


    public Book createBook(Book book) {
        book.setId(++lastId);
        books.put(lastId,book);
        return book;
    }

    public Book findBook(long id){
        return books.get(id);
    }
    public Book aditBook (Book book) {
        if (books.containsKey(book.getId())) {
            books.put(book.getId(), book);
            return book;
        }
        return null;
    }

    public Book deleteBook (long id){
        return   books.remove(id);

    }
    public Collection<Book> getAllBooks (){
        return books.values();
    }

}
