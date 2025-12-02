package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * app tha receives the users age and calculates those years
 * in days
 */
public class YearsToDaysApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int YEAR = 365;
        int age = 0;
        int ageInYears = 0;

        System.out.println("Please give your age in years");
        age  = scanner.nextInt();
        ageInYears = age * YEAR;

        System.out.printf("Your age in days is: %d \n", ageInYears);
    }
}
