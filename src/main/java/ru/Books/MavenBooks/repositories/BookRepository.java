package ru.Books.MavenBooks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Books.MavenBooks.model.Book;

import java.util.Collection;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByName(String name );
    Collection<Book> findBooksByAuthor(String author);
    Collection <Book> findAllByNameContains (String part);


}
