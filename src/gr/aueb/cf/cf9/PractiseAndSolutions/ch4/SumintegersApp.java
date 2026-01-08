package gr.aueb.cf.cf9.PractiseAndSolutions.ch4;

public class SumintegersApp {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0 ) {
                sum += i;
            }
        }

        System.out.println(sum);

        for (int i = 0; i < 50; i++) {
            sum =+ i;
        }

        for (int i = 10 ; i > 0  ; i--) {
            System.out.println(i + " ");
        }

//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j <4; j++) {
//                System.out.println( "*");
//                if (j > i) {
//                    System.out.printf( "*");
//                }
//            }
//        }

        final int levels = 4;

        for (int i = 1; i <= levels; i++) {

            // initial whitespaces
            for (int j = levels - i; j >= 1; j--) {
                System.out.print(" ");
            }

            // stars
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
