package gr.aueb.cf.cf9.ch7;

/**
 * traverses a string one by one
 * not with enhanched for.
 */
public class StrTraverse {
    public static void main(String[] args) {
        String str = "Coding Factory";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + " ");

//            reversed
//
//            for (int i = 0; i < str.length() - 1; i--) {
//                System.out.println(str.charAt(i) + " ");
//            }

        }
    }
}
