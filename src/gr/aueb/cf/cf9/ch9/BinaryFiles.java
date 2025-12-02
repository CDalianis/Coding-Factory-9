package gr.aueb.cf.cf9.ch9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BinaryFiles {
    public static void main(String[] args) {

    }

    public static void binaryFileReadWrite (String inputFile, String outputFile) {
        final  int BUFFER_SIZE = 8192;  // 8 kb
        byte [] buffer = new  byte[BUFFER_SIZE];
        int bytesRead = 0;

        try (BufferedInputStream bis = BufferedInputStream(new FileInputStream(inputFile));
             {
        }


    }

}
