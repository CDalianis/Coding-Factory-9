package gr.aueb.cf.cf9.ch9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * demo of file writers in java.io
 *
 */
public class FileWritersJavaIo {

    public static void main(String[] args) {
        File file = new File("C:/Users/Christos/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/file.txt");

        try {
            fileWriter("C:/Users/Christos/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/file.txt");
        } catch (IOException e) {
            System.out.println("Το αρχείο δεν δημιουργήθηκε ή κάποιο λάθος συνέβη κατά την εγγραφή");
        }
    }


    public static void fileWriter (String file) throws IOException {
        try (FileWriter fw =  new FileWriter(file, StandardCharsets.UTF_8)) {
            fw.write("Hello World");
            fw.flush();
        }catch ( IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void bufferedWriter (String file) throws Exception {
        
    }
}
