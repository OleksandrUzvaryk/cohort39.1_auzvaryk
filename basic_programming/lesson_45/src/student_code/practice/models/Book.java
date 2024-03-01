package student_code.practice.models;

import java.util.Objects;

// Модель
public class Book {

    Author author;
    String title;
   Enum genre;

    public Book(Author author, String title, Enum genre) {
        this.author = author;
        this.title = title;
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Enum getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return Objects.equals(author, book.author) && Objects.equals(title, book.title) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, genre);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", genre=" + genre +
                '}';
    }
}
