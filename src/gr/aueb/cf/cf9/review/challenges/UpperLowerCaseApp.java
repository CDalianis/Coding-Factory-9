package gr.aueb.cf.cf9.review.challenges;

import java.util.Scanner;

/**
 * δοθεντως ενος string, ,μετατρεπει σε κεφαλαια-πεζα
 * εναλλαξ, παραδειγμα coding -> CoDinG
 */
public class UpperLowerCaseApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String inputString = scanner.nextLine();
        char ch = ' ';


        //Εισοδος δεδομενων
        System.out.println( "Παρακαλω εισαγετε ένα string");
        inputString = scanner.nextLine();

        //Επεξεργασια - Business
        for (int i = 0; i < inputString.length() ; i++) {
            ch = inputString.charAt(i);
            if ( Character.isLetter(ch)) {
                ch = i % 2 == 0 ? Character.toUpperCase(ch) : Character.toLowerCase(ch); //prwtos xaraktiras kefalaio k meta diadoxika
                sb.append(ch);
            }
            System.out.println(sb);
        }
    }
}
