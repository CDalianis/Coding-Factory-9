package gr.aueb.cf.cf9.ch7;

public class StrIndexOf {
    public static void main(String[] args) {
        String cf = "cofingFactory";

        int positionOfo = cf.indexOf("o");
        System.out.println(positionOfo);

        int positionOfNexto = cf.indexOf("o");
        System.out.println(positionOfNexto);

        int positionOfLasto = cf.lastIndexOf("o");
        System.out.println(positionOfLasto);


    }

    //Μεθοδος που επιστρεφει τη καταληξη του ονοματος ενος αρχειου
    public static String getExtension (String fileName){
        return fileName.substring(fileName.lastIndexOf(".")+1);
    }
}
