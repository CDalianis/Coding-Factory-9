package gr.aueb.cf.cf9.practise;

import java.util.Scanner;

/*
Create a program that:
Asks the driver for the speed limit and actual speed.
Calculates if the driver is speeding.
If they are speeding, shows by how much and calculates a fine.
Keeps running until the user chooses to exit.
 */
public class SpeedingTicketCalculatorApp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int speedLimit = 0;
        int actualSpeed = 0;
        final int EXIT = 2;
        int result = 0;
        int overLimit = 0 ;
        int fine = 0;


        while (true) {

            // input choice
            printMenu();
            choice = getOneInt();


            //validation
            if (!isChoiceValid(choice)) {
                System.out.println("Type between  only 1-2");
                continue;
            }

            if (choice == EXIT) {
                System.out.println("Exit...");
                break;
            }


            //Read from user the speeds
            System.out.println("Please type speed limit");
            speedLimit = getOneInt();
            System.out.println("Please type actual Speed ");
            actualSpeed = getOneInt();



            // Επεξεργασία - Delegation

            if (actualSpeed <= speedLimit) {
                System.out.println("OK, you are within the limit.");
            }
            else {
                overLimit = calcOverLimit( actualSpeed, speedLimit);
                fine = calcFine(overLimit);

                System.out.println("You are over the limit by " + overLimit + " km. Your fine is " + fine +  " euros.");

            }
            if ( overLimit > 30) {
                System.out.println("⚠ License suspended!");
            }

        }
    }

    public static void printMenu() {
        System.out.println("Choose one of the following: ");
        System.out.println("1. Check for speeding ");
        System.out.println("2. Exit ");
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 2;

    }

    public  static int calcFine(int overLimit) {
        return overLimit*5;
    }

    public  static int calcOverLimit(int actualSpeed, int speedLimit ) {
        return actualSpeed - speedLimit;
    }

}
