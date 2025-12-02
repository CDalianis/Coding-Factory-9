package gr.aueb.cf.cf9.practise;

public class MaxPositionApp {
    public static void main(String[] args) {
        int [] arr = {2, 6, 0, 7, 34, 45, 26};
        int result = 0;

        result = getMax(arr);

        System.out.println("The max value is " + result );
    }

    public static int getMax(int [] arr) {
        int max =0;

        for (int i = 0; i < arr.length; i++) {
        if (arr[i]>max) {
            max = arr[i];
        }
        }

        return max;
    }
}
