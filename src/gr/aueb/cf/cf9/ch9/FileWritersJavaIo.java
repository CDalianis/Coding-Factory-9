package gr.aueb.cf.cf9.ch9;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritersJavaIo {
    public static void main(String[] args) {

    }

    public static void fileWriter (String file) throws Exception {
        try (FileWriter fw = = new  {
        try (FileWriter fw = = new FileWriter(file) {
            fw.write("Hello World");
            fw.flush();
        }catch ( IOException e) {
            e.printStackTrace();
            throw e;
        }

        }
    }


}
