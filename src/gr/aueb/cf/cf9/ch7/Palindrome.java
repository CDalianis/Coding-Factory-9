package gr.aueb.cf.cf9.ch7;

/**
 * an app that checks if a string is a palindrome
 * palindrome is a string that can be read the same way forward or back ward eg anna
 * or savvas
 */
public class Palindrome {

    public static void main(String[] args) {

    }

    public static boolean isPalindrome (String s) {
        for (int i = 0,  j = s.length()-1 ; i<j; i++ , j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

        }
        return true;
    }

    public static boolean isPalindrome2 (String s)  {

        return new StringBuilder(s).reverse().toString().equals(s); // without for use
    }

}
