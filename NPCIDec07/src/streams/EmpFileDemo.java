package streams;

import java.io.*;

public class EmpFileDemo {

    public static void main(String[] args) throws Exception {

        String[] lines = {"Suresh,1000","Ramesh,4000","Santosh,2000"};

        File dir = new File("D://NPCI//EmployeeData");
        dir.mkdirs();

        BufferedWriter writer = new BufferedWriter(new FileWriter(dir.getAbsolutePath()+ "//" + "EmployeeDetails.csv"));
        for(String s: lines){
            writer.write(s);
            writer.newLine();
        }
        writer.close();

    }
}
