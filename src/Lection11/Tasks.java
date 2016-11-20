package Lection11;

import java.io.IOException;
import java.util.Map;

import static Lection11.IOUtils.readFile;

/**
 * Created by Администратор on 17.11.2016.
 */
public class Tasks {
    //C:\Java\JavaCoreGoIt\Lection11.txt

    public String replacer(Map<String, String> map) {
        String readed;
        try {
            readed = readFile("C:\\Java\\JavaCoreGoIt\\Lection11.txt");
            System.out.println(readed);

        } catch (IOException ex){
            System.out.println("Someting wrong!");
        }
        return map.get(0);
    }

    /*public File fileContentReplacer(Map<String, String> map){

    }

    public File fileContentMerger(Map<String, String> map){

    }

    public void checkWord(String word){
        int result;

        System.out.println(result);
    }*/
}
