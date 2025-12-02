package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/*
count the number of the positive numbers
 */
public class PositivesCountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positives=0;

        System.out.println("Please enter a number:");
        num = scanner.nextInt();

        while (num>=0) {
            positives++;
            System.out.println("Please enter a number:");
            num = scanner.nextInt();
        }
        System.out.println("The number of positive numbers is : " + positives);

    }
}
