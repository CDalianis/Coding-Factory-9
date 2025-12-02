package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/*
coutns the number of iterations
 */
public class IterationsCountApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =0;
        int iteration =0;

        System.out.println("Please type a number tha tis not -1: ");
        num = scanner.nextInt();

        while (num!=-1) {
            iteration++;
            System.out.println("Please type a number tha tis not -1: ");
            num = scanner.nextInt();
        }
        System.out.println("The count of iterations is: " + iteration );
    }
}
