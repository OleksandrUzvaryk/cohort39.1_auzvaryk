package student_code.practice.repositories;

import student_code.practice.interfaces.BookRepository;
import student_code.practice.models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements BookRepository {

    private List<Book>books;

    public BookRepositoryImpl() {
        books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
       /* for (int i = 0; i <books.size() ; i++) {
            if (books.get(i).equals(book)){
                System.out.println("Book already exist"); }
            else {books.add(book);}
        }*/
        if (books.contains(book)){
    System.out.println("Book already exist");
    }else {books.add(book);System.out.println("Book has bean created");
        }
    }

    @Override
    public void deleteBook(Book bookForDelete) {
        if (books.contains(bookForDelete)){
            books.remove(bookForDelete);
        }else {
            System.out.println("Book is not exist !");
        }
    }

    @Override
    public List<Book> findAllBooks() {
        return books;}
        }






