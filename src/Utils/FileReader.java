package Utils;

import HuffmanArchiever.Dictionary;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader {

    public static byte[] readFile(String filePath) {
        Path path = Paths.get(filePath);
        byte[] content = new byte[0];
        try {
            content = Files.readAllBytes(path);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return content;
    }

    public static Dictionary readDictionary(String dictPath) {
        try (FileInputStream fis = new FileInputStream(dictPath)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            return (Dictionary) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException cne) {
            cne.printStackTrace();
            return null;
        }
    }

}
