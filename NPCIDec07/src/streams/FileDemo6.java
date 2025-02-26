package streams;

import java.io.*;

public class FileDemo6 {

    public static void main(String[] args) throws Exception {

        String[] employees = {"Ramesh","Suresh", "Hitesh"};

        File dir = new File("D:\\Trainings\\TalentSprint\\TestFiles\\");
        dir.mkdir();

        FileWriter writer = new FileWriter("D:\\Trainings\\TalentSprint\\TestFiles\\employees.xt");
        writer.write("List of Employees");

        for (String n : employees){
            writer.write("\n"+n);
        }

        writer.close();

        FileReader reader = new FileReader("D:\\Trainings\\TalentSprint\\TestFiles\\employees.xt");
        while(reader.ready()){
            System.out.print((char) reader.read());
        }



    }
}
