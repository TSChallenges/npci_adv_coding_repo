package streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class EmpDataReader {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(File.separator+"NPCI"+ File.separator+"EmployeeData"+ File.separator+"EmployeeDetails.csv"));
            while(reader.ready()){
                String line = reader.readLine();
                String empData[] = line.split(",");
                String name = empData[0];
                String salary = empData[1];
                System.out.println("Name="+name+", Salary="+salary);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
