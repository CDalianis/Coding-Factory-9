package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * reads two integers and calculates the result
 */
public class AddScannerApp {
    public static void main(String[] args) {
        //dilwseis
        Scanner scanner = new Scanner(System.in); //system in  einai to keyboard
        int num1=0;
        int num2=0;
        int sum = 0;

        //entoles
        System.out.println("Please give two integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;

        System.out.printf("The sum of %d and %d is: %d\n", num1, num2, sum);

    }
}
