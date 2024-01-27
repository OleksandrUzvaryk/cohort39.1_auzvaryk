package student_code;

import java.util.*;

public class Cards {

    private HashMap<String, String> words = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    private HashSet<String> incorrectWords = new HashSet<>();

public void start(){
    boolean continueWorking = true;
   W: while (continueWorking){
        System.out.println("Введите номер операции:\n" +
                "1. Добавить новые слова\n" +
                "2. Практика всех слов\n" +
                "3. Практика сложных слов\n" +
                "4. Добавление сложных слов\n" +
                "5. Удаление карточек\n" +
                "0. Выход из приложения");


        String command = scanner.nextLine();
        switch (command){
            case "1":
                addNewWords();break;
            case "2":
                chekKnowledge();break;
            case "3":
                checkDifficultWords();break;
            case "4":
                addWordToIncorrectSet();break;
            case "5":
                removeCards();break;
            case "0":
                System.out.println("Спасибо за использование - до свидание!");
                // continueWorking = false; - булевый фаг
                // return; - останова метода
                //System.exit(0);- аостановка всего приложения
                break W;
            default:
                System.out.println("Некорректный ввод, еще раз!");

        }
    }
}


    private void addNewWord() {
        System.out.println("Введите значение для слова");
        String key = scanner.nextLine().trim().toUpperCase();
        System.out.println("Введите перевод для слова");
        String value = scanner.nextLine().trim().toUpperCase();

        if (!words.containsKey(key)){
            words.put(key, value);
        } else if (words.containsKey(key) && !value.equals(words.get(key))){
            System.out.println("карточка с таким словом уже есть, и имеет альтернативный перевод" + words.get(key) + ". " +
                    "Хотите заменить карточку новым значением? да/нет");
            if ("да".equalsIgnoreCase(scanner.nextLine())) { // если хотим - перезаписываем перевод словаwords.put(key, value);
        }

        }
    }





    public void removeCards(){
        while (true){
           removeCard();
            System.out.println("Хотите ли удалить еще одну пару слов? да/нет");
            if("нет".equalsIgnoreCase(scanner.nextLine().trim())){
                break;
            }
        }
    }

    public void addNewWords() {
        while (true) {
            addNewWord();
            System.out.println("Хотите добавить новую карточку? да/нет.");
            if ("нет".equalsIgnoreCase(scanner.nextLine().trim())) {
                break;
            }
        }
    }

    public void chekKnowledge() {
        for (String key : words.keySet()) { // перебор коллекции ключей
            System.out.println("Пожалуйста введите перевод для слова " + key);
            String answer = scanner.nextLine().trim().toUpperCase();
            if (answer.equalsIgnoreCase(words.get(key))) { //если ответ верный
                System.out.println("Ответ верный!");
            } else {
                incorrectWords.add(key);
            } //если ответ не верный - помещаем ключ в коллекцию неверных ответов
        }
    }



    public void checkDifficultWords() {
        System.out.println("Начинаем повторение сложных слов :");
        Collection<String> wordsToRemove = new HashSet<>();


        for (String key : incorrectWords) {
            System.out.println("Пожалуйста введите перевод для слова " + key);
            String answer = scanner.nextLine().trim().toUpperCase();
            if (answer.equalsIgnoreCase(words.get(key))) { //если ответ верный
                System.out.println("Ответ верный! Хотите удалить слово из списка повторений? удалить/оставить");
                if ("удалить".equalsIgnoreCase(scanner.nextLine().trim())){
                  wordsToRemove.add(key);
                   }else {
                       System.out.println("Слово" + key + " оставлено в списке сложных слов");
                   }
                }
            }incorrectWords.removeAll(wordsToRemove);
        }

public void addWordToIncorrectSet(){
    System.out.println("Введите слово, которое вы хотите чаще практиковать:");
    String newWordPractice = scanner.nextLine().trim().toUpperCase();
    for (String key:words.keySet()) {
        if (key.equalsIgnoreCase(newWordPractice)){
            System.out.println("Такое слово уже есть в нашей картотеке!");break;}
        else {incorrectWords.add(newWordPractice);
            System.out.println("Слово в список сложных слов добавлено");}
        }
    }
public void removeCard(){
    System.out.println("Введите слово, которое хотите удалить из карточек:");

    String key = scanner.nextLine().trim().toUpperCase();
    if (words.containsKey(key)){
        words.remove(key);
    }else {
        System.out.println("Слово отсутствует");
    }

    if (incorrectWords.contains(key)){
        incorrectWords.remove(key);
    }else {
        System.out.println("Слово отсутствует");
    }

}


}
        
        




