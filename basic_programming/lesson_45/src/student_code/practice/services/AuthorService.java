package student_code.practice.services;

import student_code.practice.interfaces.AuthorRepository;
import student_code.practice.models.Author;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Слой бизнес-логики
public class AuthorService {

    private AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public List<Author> findAllAuthors(String name) {
        List<Author> authorList = new ArrayList<>();

        for (Author author : repository.findAllAuthors()) {
            if (author.getName().contains(name)) {
                authorList.add(author);
            }else {return null;}
        }

        return authorList;
    }

    public List<Author> getAllAuthors() {
        return repository.findAllAuthors();
    }

    public void addAuthor(Scanner scanner) {
        //stub
        scanner.nextLine();
        System.out.println("Пожалуйста введите полное имя автора:");
        String authorName = scanner.nextLine();
        System.out.println("Пожалуйста год рождения автора:");
        int yearOfBirth = scanner.nextInt();
        // validation

        Author author = new Author(authorName, yearOfBirth);
        repository.addAuthor(author);
    }

    public void deleteAuthorFromRepository(String name) {
        for (int i = 0; i <repository.findAllAuthors().size() ; i++) {
            if (repository.findAllAuthors().get(i).getName().equalsIgnoreCase(name)) {
                repository.deleteAuthor(repository.findAllAuthors().get(i));
            } else {
                System.out.println("Author is not exist!");
            }

        }
    }








}
