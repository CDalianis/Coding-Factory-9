package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/*
an app tha calculates if a year is leap year or not
 */
public class LeapYearApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entryYear = 0;
        boolean isLeapYear= false;

        System.out.println("Please type year:");
        entryYear = scanner.nextInt();

        isLeapYear = (entryYear/4==0) && (entryYear/100!=0);

        System.out.printf("The year you typed is Leap Year:" + isLeapYear);

    }
}
