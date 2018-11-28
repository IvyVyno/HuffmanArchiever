package Utils;

import HuffmanArchiever.Dictionary;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWriter {
    public static void writeCompressedFile(int size, byte[] content, Dictionary dictionary, String filePath, String dictPath) {
        try (FileOutputStream compressedFos = new FileOutputStream(filePath);
             FileOutputStream dict = new FileOutputStream(dictPath)) {

            ObjectOutputStream oos = new ObjectOutputStream(dict);
            oos.writeObject(dictionary);
            oos.close();

            compressedFos.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeDecompressedFile(byte[] content, String filePath) {
        try (FileOutputStream decompressedFos = new FileOutputStream(filePath)) {
            decompressedFos.write(content);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
