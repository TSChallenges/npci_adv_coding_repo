package streams;

import java.io.File;

public class FileDemo5 {

    public static void main(String[] args) {
        File npciDir = new File("D:\\Trainings\\TalentSprint\\samplecode\\NPCIDec07\\src");
        printFiles(npciDir);
    }

    public static void printFiles(File file){
        if(file.isFile()){
            System.out.println("File : " + file.getName());
        }else if (file.isDirectory()){
            System.out.println("-- DIR : " + file.getAbsolutePath() );
            for (File f : file.listFiles()){
                printFiles(f);
            }
        }

    }

}
