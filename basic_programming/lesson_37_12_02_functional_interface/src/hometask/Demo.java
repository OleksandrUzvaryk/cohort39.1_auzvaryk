package hometask;


import java.util.LinkedList;
import java.util.List;


public class Demo {
    public static void main(String[] args) {

        LinkedList <Integer> list = new LinkedList<>();
        list.add(10);
        list.add(100);
        list.add(1000);
        list.add(10000);
        System.out.println("My list -> " + list);


        // метод execute в качестве аргумента принимает значение из дженерика,и ничего не возвращает
        Action<LinkedList> actionExample = l-> list.remove(1);
        actionExample.execute(list);
        System.out.println("Result of method execute, delete number[100] -> " + list);

        //в качестве дженерика принимает дженерик, такой же тип данных должен работать в качестве аргумента в методе test,
        // который обязан вернуть булеан
        Condition<LinkedList> conditionExample = l -> l.isEmpty();
        System.out.println("List is empty ? " + conditionExample.test(list));


        // в качестве дженерика принимает некий тип, этот же тип должен быть возвращен в анонимном методе provide() который и надо переопределить.
        // То есть данный метод должен создавать внутри себя экземпляр класса <дженерик>
        Provider<Storage> providerExample = ()-> new Storage("Wheels", 410.17, false);
        System.out.println(providerExample.provide());



    }
}
