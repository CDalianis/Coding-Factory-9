package gr.aueb.cf.cf9.PractiseAndSolutions.ch2;

import java.util.Scanner;

/*
an app that reads from the user an integer that is the
temperature in fahrenheit and turns it to celsius
 */
public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperatureInCelsius = 0;
        int temperatureInFahrenheit = 0;


        System.out.println("Please insert a temperature in Fahrenheit:");
        temperatureInFahrenheit = scanner.nextInt();


        temperatureInCelsius = 5* (temperatureInFahrenheit-32) /9;

        System.out.println("Temperature in Celsius is:" + temperatureInCelsius);



    }
}
