package gr.aueb.cf.cf9.ch8;

import java.time.LocalDateTime;

/**
 * H BankApp παρεχει μονο μια υπηρεσια
 * την υπηρεσια καταθεσης
 */
public class BankApp {
    static double balance = 0.0;

    public static void main(String[] args) {

        try {
            deposit(1000);
        } catch (Exception e) {
            System.out.println("Δεν μπορει να γινει καταθεση αρνητικου ποσου");
        }
    }

    // stin parakatw methodo kanoume throw 2 fores, prwta stin arxi gia epixeirisiaki
    //logiki wste na min dinetai arnitiko poso, kai meta stin catch ksanakanoume throw wste
    //na metadothei to exception kai sti main
    public static void deposit ( double amount) throws Exception {
        try {
            if (amount < 0 ) throw  new Exception("Amount cannot be negative");
            balance += amount;
            //logging
        } catch (Exception e) {
            System.err.print(LocalDateTime.now() + "\n" + e.getMessage());
            throw e;
        }


    }
}
