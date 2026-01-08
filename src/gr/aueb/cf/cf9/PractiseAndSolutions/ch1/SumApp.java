package gr.aueb.cf.cf9.PractiseAndSolutions.ch1;

import java.util.Scanner;

public class SumApp {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give integer 1: ");
        num1 = scanner.nextInt();

        System.out.println("Give integer 2: ");
        num2 = scanner.nextInt();

        sum = num1 + num2;

        System.out.printf("To αποτελεσμα της προσθεσης %d και %d ειναι ισο με  %d", num1 , num2 , sum );
    }
}
