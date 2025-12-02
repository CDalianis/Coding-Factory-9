package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

public class EvenApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean result = false;

        //εισοδος δεδομενων
        System.out.println("Please enter a number: ");
        while (!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter a number: ");
            scanner.nextLine();
        }
        num = scanner.nextInt();

        result = isEven(num);

        //
        System.out.println("The number is even " + result);
    }

    /**
     * Checks if a number is even.
     * true if the number is even, false if the number is false.
     */
    public static boolean isEven (int num) {
        return num % 2 == 0;
    }
}
