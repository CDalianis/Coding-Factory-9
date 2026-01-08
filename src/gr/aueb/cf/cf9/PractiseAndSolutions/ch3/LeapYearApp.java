package gr.aueb.cf.cf9.PractiseAndSolutions.ch3;

import java.util.Scanner;

public class LeapYearApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        boolean isLeap = false;

        System.out.println("Παρακαλω πληκτρολογιστε ενα ετος: ");

        year = scanner.nextInt();

//        if (year % 400 = 0 || year % 100 ){
//                isLeap = true;
//        }

        isLeap = year % 400 == 0 || (year % 100 == 0 && year % 4 != 0 );

        System.out.println("Το ετος" + year + "ειναι δισκετο: " + isLeap);
    }


}
