package streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReadDemo1 {

    public static void main(String[] args) throws Exception {

        File npci_file = new File("npcidemo.txt");

        FileInputStream fis = new FileInputStream(npci_file);
        while (fis.available() > 0){
            System.out.print((char) fis.read());
        }
        fis.close();

        System.out.println();

        FileInputStream fis2 = new FileInputStream(npci_file);
        byte[] bytes = fis2.readAllBytes();
        String str = new String(bytes);
        System.out.println(str);


    }
}
