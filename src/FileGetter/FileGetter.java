package FileGetter;

import HuffmanArchiever.Compressor;
import HuffmanArchiever.Decompressor;


import java.util.Scanner;

public class FileGetter {

    public static void getFile() {
        System.out.print("File location:");
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        int lastIndexOf = file.lastIndexOf(".");

        if(lastIndexOf == -1) {
            System.out.println("No extension");
        }

        String ext = file.substring(lastIndexOf);

        if(ext.equals(".hf")){
            Decompressor.decompress(file);
        } else {
            Compressor.compress(file);
        }
    }
}
