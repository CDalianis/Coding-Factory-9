package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * Create a message that contains the name of the user and the age.
 *
 */
public class StrConcat {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String firstname = "";
        int age = 0;
        String message = "";


        //input
        System.out.println("Please enter your first name: ");
        firstname = scanner.nextLine();

        while (!scanner.hasNextInt()) {
            System.out.println("invalid input. Please enter a number: ");
            scanner.nextLine();
        }
        age =scanner.nextInt();

        // call a service method
        message = createMessage(firstname,age);

        //print results
        System.out.println(message);
    }

    public static String createMessage (String firstname, int age) {
        return String.format("Hello my name is %s and i am %d years old." ,firstname, age);

    }
}
