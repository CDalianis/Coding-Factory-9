package gr.aueb.cf.cf9.ch3;

public class SpecialCasesWhile {
    public static void main(String[] args) {
        int i = 1;

        while (i<0) {
            System.out.println("never gets into this loop");
            i++;
        }
        while (i<=1) {
            System.out.println("runs only once");
            i++;
        }
      //  while (true) {
       //     System.out.println("runs forever, infinite loop");
       // }
    }
}
