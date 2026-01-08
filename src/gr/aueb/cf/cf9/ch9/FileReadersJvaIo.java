package gr.aueb.cf.cf9.ch9;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class FileReadersJvaIo {
    public static void main(String[] args) {
        File file = new File("C:/Users/Christos/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/file.txt");

        try {
            bufferedReader(file);

        } catch (IOException e) {
            System.out.println("Καποιο λαθος συνεβη κατα την αναγνωση");
        }
    }

    public static void fileReader(String file) throws IOException {
        try (FileReader fr = new FileReader(file, StandardCharsets.UTF_8)) {
            int bytesRead= 0;

            while ((bytesRead = fr.read()) != -1) {
                System.out.print((char) bytesRead);
            }
        } catch ( IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void  bufferedReader(File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))){
            String line;

            while ((line = br.readLine()) != null ) {
                System.out.println(line);
            }

        }
    }
}
