package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class ShowDateApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = 0;
        int months = 0;
        int days = 0;

        System.out.println("Please give a number for years:");
        years = scanner.nextInt();
        System.out.println("Please give a number for months:");
        months = scanner.nextInt();
        System.out.println("Please give a number for days:");
        days = scanner.nextInt();

        System.out.println("The date you typed is: " + days + "/" + months + "/"+ years%100 );

    }
}
