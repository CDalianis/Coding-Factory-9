package gr.aueb.cf.cf9.ch7;

/**
 * an application that counts how many characters exist in a string
 */
public class CharCount {

    public static void main(String[] args) {

    }

    public static int countChars( String s) {
        if ( s == null)return  0;
        return s.length();
    }
}