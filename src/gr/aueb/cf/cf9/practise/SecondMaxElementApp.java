package gr.aueb.cf.cf9.practise;

public class SecondMaxElementApp {
    public static void main(String[] args) {
        int [] arr = {2, 6, 0, 7, 34, 45, 26};
        int result = 0;



        System.out.println("The max value is " + result );
    }


//    public static int getSecondMax(int[] arr) {
//        if (arr == null || arr.length < 2) {
//            throw new IllegalArgumentException("Array must have at least 2 elements");
//        }
//
//        // First pass: find the max
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//
//        // Second pass: find second max (excluding max)
//        int secondMax = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > secondMax && arr[i] < max) {
//                secondMax = arr[i];
//            }
//        }
//
//        if (secondMax == Integer.MIN_VALUE) {
//            throw new IllegalArgumentException("All elements are the same");
//        }
//
//        return secondMax;
//    }
//
//        public static int countMax(int [] [] arr  ) {
//                int num = 0;
//                int maxNum = 0;
//
//            for (int i = 0; i <; i++) {
//            for (int j = 0; j < ; j++) {
//                if (j ==1) {
//                    num++;
//                    if (maxNum<num){
//                    maxNum = num;
//                    }
//                }
//             else if (j==0){
//                    num--;
//                }
//
//
//
//            }
//        }
//        }
    }


