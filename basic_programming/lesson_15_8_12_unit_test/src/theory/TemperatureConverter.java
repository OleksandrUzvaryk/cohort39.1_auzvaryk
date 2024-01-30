package theory;

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 100;
        double fahrenheit = 212;

        //было (просто печать, нельзя импользовать данные конвертации вдальнейшем):
        celsiusToFahrenheit(celsius);
        fahrenheitToCelsius(fahrenheit);


        // стало:
        double celsiusToFahrenheit = celsiusToFahrenheitWithReturn(celsius);
        double fahrenheitToCelsius = fahrenheitToCelsiusWithReturn(fahrenheit);

        // можно выстраивать логику приложения на основе полученных данных (например использовать в if-elde или while)

        System.out.println(celsius + " °C = " + celsiusToFahrenheit + " °F");
        System.out.println(fahrenheit + " °F = " + fahrenheitToCelsius + " °C");
    }

    // Конвертирует температуру из Цельсия в Фаренгейты
    public static void celsiusToFahrenheit(double celsius) {
        double celsiusToFahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " °C = " + celsiusToFahrenheit + " °F");
    }

    // Конвертирует температуру из Фаренгейтов в Цельсии
    public static void fahrenheitToCelsius(double fahrenheit) {
        double fahrenheitToCelsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " °F = " + fahrenheitToCelsius + " °C");
    }

    // Конвертирует температуру из Цельсия в Фаренгейты
    public static double celsiusToFahrenheitWithReturn(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Конвертирует температуру из Фаренгейтов в Цельсии
    public static double fahrenheitToCelsiusWithReturn(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
