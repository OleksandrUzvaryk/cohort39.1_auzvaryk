package student_code.practice.interfaces;

import student_code.practice.models.Book;

import java.util.List;

// Слой доступа к данным (Data Access Layer)
public interface BookRepository {

    void addBook(Book book);

    void deleteBook (Book book);

    List<Book> findAllBooks();


}

