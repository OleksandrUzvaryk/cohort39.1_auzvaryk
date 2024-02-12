package Hometask.task1;

import java.util.HashMap;

public class Demo {

    /**Создать класс Report, который имеет две ответственности: формирование и печать отчёта.
     Затем разделите его так, чтобы каждый класс имел только одну ответственность.
     **Класс, где происходит демонстрация методов**
     */
    public static void main(String[] args) {

        Report service = new Report();
        HashMap result = service.makeReport("Windows", 11);
        service.printReport(result);

        System.out.println("----------------------------------------");

        ReportWindows reportWindows = new ReportWindows();
        PrintService printService = new PrintService();
        HashMap result2 = reportWindows.makeReport2("Linux", 200);
        printService.printReport2(result2);



    }
}
