package student_code.practice.services;

import student_code.practice.interfaces.AuthorRepository;
import student_code.practice.interfaces.BookRepository;
import student_code.practice.models.Author;
import student_code.practice.models.Book;
import student_code.practice.models.Genre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Слой бизнес-логики
public class BookService {
    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }


    public void addNewBook (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите полное имя автора: ");
        String name = scanner.nextLine();
        System.out.println("Введите возраст -> ");
        Integer age = scanner.nextInt();
        scanner.nextLine();
        Author author = new Author(name, age);
        authorRepository.addAuthor(author);
        System.out.println("Введите название книги -> ");
        String title = scanner.nextLine();
        System.out.println("Введите жанр книги -> " +
                "    FANTASY,\n" +
                "    ROMANCE,\n" +
                "    DRAMA,\n" +
                "    MYSTERY,\n" +
                "    BIOGRAPHY,\n" +
                "    DETECTIVE,\n" +
                "    HISTORICAL,\n" +
                "    POETRY,\n" +
                "    SCIENCE_FICTION,\n" +
                "    NONFICTION,\n" +
                "    MYTHOLOGY");
        String genre = scanner.nextLine();
        Book newBook = new Book(author, title, Genre.valueOf(genre) );
        bookRepository.addBook(newBook);
    }

    public void deleteBookFromLibrary(String bookTitle) {
        for (int i = 0; i <bookRepository.findAllBooks().size() ; i++) {
            if (bookRepository.findAllBooks().get(i).getTitle().equalsIgnoreCase(bookTitle)) {
                authorRepository.deleteAuthor(bookRepository.findAllBooks().get(i).getAuthor());
                bookRepository.deleteBook(bookRepository.findAllBooks().get(i));
            } else {
                System.out.println("Book is not exist!");
            }
        }
    }

    public List<Book> findAllBook (){
        List<Book> booksAll = bookRepository.findAllBooks();
        if (booksAll.isEmpty()){
            System.out.print("In that moment amount of book -> ");return null;
        }else return booksAll;
    }

    public List<Book> findAllBookByGenre(Genre genre){
        List<Book> booksByGenre = new ArrayList<>();
        for (Book book: bookRepository.findAllBooks()) {
            if(book.getGenre().equals(genre)){
                booksByGenre.add(book);
            }else System.out.println("That genre not exist!");
        }return booksByGenre;
    }


}






