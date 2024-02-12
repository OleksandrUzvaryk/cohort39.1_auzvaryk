package hometask.task4;


/**
 *
 *
 * Создать интерфейс Machine с методами print(), fax() и scan().
 * Реализуйте классы Printer и Photocopier, которые имплементируют только необходимые методы
 */
public class Demo {

    public static void main(String[] args) {

      Printer printer = new Printer("Hp", false);
      Photocopier photocopier = new Photocopier("z-14", true);

      System.out.print("Printer ---- ");
      printer.print();

      System.out.print("Photocopier ---- ");
      photocopier.scan();
      System.out.print("Photocopier ---- ");
      photocopier.print();

    }
}
