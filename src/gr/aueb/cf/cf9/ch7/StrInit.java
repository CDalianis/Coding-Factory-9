package gr.aueb.cf.cf9.ch7;

/**
 *
 * Δήλωση και αρχικοποιηση (populate)
 * ενος{@link String}
 */
public class StrInit {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 = new String("Athens"); //not popular

        System.out.println(s1);
        System.out.println("length: " + s1.length());
        System.out.printf("City %s1\n", s1);
    }
}
