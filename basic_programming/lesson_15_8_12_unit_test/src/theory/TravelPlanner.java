package theory;

import java.util.Scanner;

/**
 * Программа для планирования путешествий без использования статических переменных и ООП.
 */
public class TravelPlanner {

    public static void main(String[] args) {
        start();
    }

    /**
     * Главный метод для запуска приложения.
     */
    public static void start() {
        final int MAX_DESTINATIONS = 10;
        String[] destinations = new String[MAX_DESTINATIONS];
        double[] costs = new double[MAX_DESTINATIONS];
        int[] durations = new int[MAX_DESTINATIONS];
        int destinationCount = 0;

        Scanner scanner = new Scanner(System.in);
        String input;

        while (destinationCount < MAX_DESTINATIONS) {
            System.out.println("Введите название места назначения (или 'exit' для завершения): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Введите стоимость поездки: ");
            double cost = scanner.nextDouble();

            System.out.println("Введите продолжительность поездки в днях: ");
            int duration = scanner.nextInt();
            scanner.nextLine(); // Очистить буфер сканера

            destinations[destinationCount] = input;
            costs[destinationCount] = cost;
            durations[destinationCount] = duration;
            destinationCount++;
        }

        printTravelPlan(destinations, costs, durations, destinationCount);
    }

    /**
     * Вычисляет и возвращает общую стоимость путешествия.
     *
     * @param costs Массив стоимостей поездок.
     * @param destinationCount Количество мест назначения.
     * @return Общая стоимость путешествия.
     */
    public static double calculateTotalCost(double[] costs, int destinationCount) {
        double totalCost = 0;
        for (int i = 0; i < destinationCount; i++) {
            totalCost += costs[i];
        }
        return totalCost;
    }

    /**
     * Вычисляет и возвращает общую продолжительность путешествия в днях.
     *
     * @param durations Массив продолжительностей поездок.
     * @param destinationCount Количество мест назначения.
     * @return Общая продолжительность путешествия.
     */
    public static int calculateTotalDuration(int[] durations, int destinationCount) {
        int totalDuration = 0;
        for (int i = 0; i < destinationCount; i++) {
            totalDuration += durations[i];
        }
        return totalDuration;
    }

    /**
     * Выводит итоговый план путешествия, включая места назначения, стоимость и продолжительность каждого этапа,
     * а также общую стоимость и продолжительность путешествия.
     *
     * @param destinations Массив мест назначения.
     * @param costs Массив стоимостей поездок.
     * @param durations Массив продолжительностей поездок.
     * @param destinationCount Количество мест назначения.
     */
    public static void printTravelPlan(String[] destinations, double[] costs, int[] durations, int destinationCount) {
        System.out.println("Итоговый План Путешествия:");
        for (int i = 0; i < destinationCount; i++) {
            System.out.println((i + 1) + ". " + destinations[i] + " - " + costs[i] + " eur., " + durations[i] + " дней");
        }
        System.out.println("Общая стоимость: " + calculateTotalCost(costs, destinationCount) + " eur.");
        System.out.println("Общая продолжительность: " + calculateTotalDuration(durations, destinationCount) + " дней");
    }
}
