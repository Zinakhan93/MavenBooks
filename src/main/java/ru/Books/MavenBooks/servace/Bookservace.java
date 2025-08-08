package ru.Books.MavenBooks.servace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.Books.MavenBooks.model.Book;
import ru.Books.MavenBooks.repositories.BookRepository;

import java.util.Collection;

@Service
public class Bookservace {
    final BookRepository bookRepository;

    public Bookservace(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book) {
         return bookRepository.save(book);
    }

    public Book findBook(Long id){
        return bookRepository.findById(id).get();
    }
    public Book aditBook (Book book) {
        return bookRepository.save(book);
    }
    public void deleteBook (Long id){
        bookRepository.deleteById(id);
    }
    public Collection<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    public Book findByName (String name){
        return bookRepository.findByName(name);}
    public Collection <Book> findBooksByAuthor (String author){
        return bookRepository.findBooksByAuthor(author);

    }
    public Collection <Book> findByNamePart(String part){
        return bookRepository.findAllByNameContains(part);
    }
}
