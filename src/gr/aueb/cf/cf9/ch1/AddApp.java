package gr.aueb.cf.cf9.ch1;

/**
 * adds two integers and prints the result in the console
 */
public class AddApp {
    public static void main(String[] args) {
        // dilosi kai arxikopoiisi metavlitwn

        int num1 = 5;
        int num2 = 10;
        int result ;

        //entoles
        result = num1 + num2;

        //ektipwsi apotelesmatos
        System.out.println("To apotelesma einai:" + result);
        System.out.println("To apotelesma twn:"+ num1 + "," + num2 + " einai: "+ result);
        System.out.printf("Το άθροισμα των: %,d, %,d είναι: %,d\n", num1, num2, result);// enalaktikos tropos gia print
    }
}
