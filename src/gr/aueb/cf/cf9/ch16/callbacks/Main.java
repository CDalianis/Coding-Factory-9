package gr.aueb.cf.cf9.ch16.callbacks;

public class Main {

    public static void main(String[] args) {

        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Hello World");
            }
        };

        //Lambda expression
        Printable printable2 = () -> System.out.println("Hello World!"); // me afto to lambda ilopoiw tin print
        Printable printable3 = () -> doPrint();
        Printable printable4 = Main::doPrint;
    }

    public static void doPrint() {
        System.out.println("Hello World! ");
    }
}
