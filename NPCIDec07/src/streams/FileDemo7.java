package streams;

import java.io.*;

public class FileDemo7 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader("D:\\Trainings\\TalentSprint\\TestFiles\\employees.xt"));
        while ((reader.ready())){
            String line = reader.readLine();
            System.out.println(line);
        }
        reader.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Trainings\\TalentSprint\\TestFiles\\BufferDemo.txt"));
        writer.write("This is First Line");
        writer.newLine();
        writer.write("This is Line 2");
        writer.close();



    }
}
