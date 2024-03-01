package student_code.practice.services;

import student_code.practice.interfaces.ReaderRepository;
import student_code.practice.models.Reader;

import java.util.List;
import java.util.Scanner;

// Слой бизнес-логики
public class ReaderService {

   private ReaderRepository readerRepository;

   public ReaderService(ReaderRepository readerRepository) {
      this.readerRepository = readerRepository;
   }

   public void addNewReader(){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Запускаем процесс введения нового пользователя. Пожалуйста введите адрес электронной почты: ");
      String email = scanner.nextLine();
      System.out.println("Введите ваш пароль -> ");
      String password = scanner.nextLine();
      Reader newReader = new Reader(email,password);
      readerRepository.registerReader(newReader);
   }


   public List<Reader> findAllReader (){
      List<Reader> readersAll = readerRepository.findAllReaders();
      return readersAll;
   }


}
