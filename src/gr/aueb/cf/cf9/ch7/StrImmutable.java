package gr.aueb.cf.cf9.ch7;

/**
 * strings are cached in SCP
 */
public class StrImmutable {
    public static void main(String[] args) {
        String str1 = "coding";
        String str2 = "coding";

        str2 = "Factory";

        System.out.println(str1);
        System.out.println(str2);
    }
}
