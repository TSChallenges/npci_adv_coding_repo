package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("secondfile.txt");

            fos.write("This is second file.......".getBytes());


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fis = new FileInputStream("D:\\Trainings\\TalentSprint\\samplecode\\NPCIDec07\\secondfile.txt");
            byte[] bytes = fis.readAllBytes();
            System.out.println("Data from File : \n" + new String(bytes));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
