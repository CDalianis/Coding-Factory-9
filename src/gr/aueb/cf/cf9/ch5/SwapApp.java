package gr.aueb.cf.cf9.ch5;
/*
define a method swap(int a, int b) that will exchange values a,b

 */
public class SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("a=%d, b = %d\n", a , b);
        swap(a,b);
        System.out.printf("a=%d, b = %d\n",a , b);
    }
    /*
    swaps two numbers
     */
    public static  void swap(int a, int b) {
        int temp = a ;
        a = b;
        b = temp ;

    }
}
