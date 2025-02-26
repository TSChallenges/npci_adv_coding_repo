package streams;

import java.io.*;

public class FileDemo1 {

    public static void main(String[] args) throws IOException {

        File npcidemo_file = new File("npcidemo.txt");
        System.out.println("File Exists: " + npcidemo_file.exists());
        boolean created = npcidemo_file.createNewFile();
        System.out.println("File created : " + created);
        System.out.println("Path = " + npcidemo_file.getPath());
        System.out.println("Absolute Path " + npcidemo_file.getAbsolutePath());


        String str = "Hello!  This is my first file created in java.\n";
        byte[] strbyte = str.getBytes();

        FileOutputStream fos = new FileOutputStream(npcidemo_file,true);
        fos.write(strbyte);
        fos.close();

        FileOutputStream fos2 = new FileOutputStream(npcidemo_file,true);
        for(byte b : strbyte){
            fos2.write(b);
        }
        fos2.close();



        System.out.println("Wrote date into file");



    }

}
