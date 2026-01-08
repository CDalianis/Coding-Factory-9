package gr.aueb.cf.cf9.PractiseAndSolutions.ch3;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Παρακαλω πληκτρολογιστε μια επιλογη μεταξυ 1 και 5: ");
            System.out.println("1. Επιλέξατε Εισαγωγή");
            System.out.println("2. Επιλεξατε Διαγραφη");
            System.out.println("3. Επιλεξατε Ενημερωση");
            System.out.println("4. Επιλεξατε Αναζητηση");
            System.out.println("5. Επιλεξατε Εξοδος");

            choice = scanner.nextInt();


            if (choice == 1) {
                System.out.println("1. Επιλέξατε Εισαγωγή");
                break;
            } else if (choice == 2) {
                System.out.println("2. Επιλεξατε Διαγραφη");
                break;
            } else if (choice == 3) {
                System.out.println("3. Επιλεξατε Ενημερωση");
                break;
            } else if (choice == 4) {
                System.out.println("4. Επιλεξατε Αναζητηση");
                break;
            } else if (choice == 5) {
                System.out.println("5. Επιλεξατε Εξοδος");
                break;
            } else {
                System.out.println("Παρακαλω επιλέξτε μια επιλογη μεταξυ 1 και 5");
                continue;
            }
        }
    }
}