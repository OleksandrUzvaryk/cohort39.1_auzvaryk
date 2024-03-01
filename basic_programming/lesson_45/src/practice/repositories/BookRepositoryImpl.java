package practice.repositories;

import practice.interfaces.AuthorRepository;
import practice.interfaces.BookRepository;
import practice.models.Author;
import practice.models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {


    private List<Book>books;


    public BookRepositoryImpl() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
if (books.contains(book)){
    System.out.println("Book already exist");
}else {
    books.add(book);
    System.out.println("Book has bean created");
}
    }

    @Override
    public void deleteBook(Book bookForDelete) {
        books.remove(bookForDelete);

    }

    @Override
    public List<Book> findAllBooks() {
        return books;
    }

        }






