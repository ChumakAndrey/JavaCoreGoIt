package Lection11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Администратор on 17.11.2016.
 */
public final class IOUtils {
    public static String readFile (String path) throws IOException{
        String result;
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            result = sb.toString();
        }
        return result;
    }
}
