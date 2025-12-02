package gr.aueb.cf.cf9.ch7;

public class StrEtc {

    public static void main(String[] args) {

        //Traverse
        String s = "Coding Factory";

        for (char ch : s.toCharArray()) {
            System.out.print(ch + " ");
        }
        System.out.println("\u2764");

        //replace
        String firstname = "Maroa-Helen";
        String simpleName = firstname.replace("-", " ");

        //Concat
        String lastname = "Smith";
        String fullName1 = firstname + " " + lastname;
        String fullName2 = firstname.concat("  ").concat(lastname);
    }
}
