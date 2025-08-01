package ru.Books.MavenBooks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Books.MavenBooks.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
