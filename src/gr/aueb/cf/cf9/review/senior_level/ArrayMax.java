package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

public class ArrayMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 5;
        int [] numbers = new int[SIZE];
        int maxPosition = 0;
        int maxValue = 0;

        //εισοδος δεδομενων
        System.out.println("Please enter five integers: ");
        for (int i = 0; i < numbers.length ; i++) {

            //Validate inputs

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer");

            }

        }
        //delegation

        maxPosition = findMaxPosition(numbers);
        maxValue = numbers[maxPosition];

        //print results

        System.out.printf("The maximum value is %d at position %d. \n", maxValue,(maxPosition + 1));
    }


    public static int findMaxPosition (int[] arr) {
        if (arr == null || arr.length == 0 ) return Integer.MIN_VALUE;
        int maxPosition = 0;
        int maxValue = arr [maxPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];

            }
        }
        return maxPosition;
    }
}
