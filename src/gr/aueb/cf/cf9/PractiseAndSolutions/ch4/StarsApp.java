package gr.aueb.cf.cf9.PractiseAndSolutions.ch4;


public class StarsApp {


    public static void main(String[] args) {
        int num = 5;

        for (int i = 0; i <  num ; i++) {

            System.out.println("*");
        }



        for (int i = 0; i <  num ; i++) {

            System.out.printf("*");
        }



        for (int i = 0; i <=  num ; i++) {
            System.out.println("*");
            for (int j = 0; j <= num; j++) {
                System.out.printf("*");
            }
        }



        for (int i = num; i >=  0 ; i--) {

            System.out.println("*");
        }
    }
}
