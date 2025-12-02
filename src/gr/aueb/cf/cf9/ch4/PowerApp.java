package gr.aueb.cf.cf9.ch4;
/*
user will type base and power and the program will
calculate the power
 */
import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 1;
        int result = 1;

        System.out.println("Please type the base:");
        base = scanner.nextInt();
        System.out.println("Please type the power:");
        power = scanner.nextInt();

        for ( int i = 1; i <= power ; i++ ) result =  result * base;


        System.out.println("The power is: " + result );


    }
}
