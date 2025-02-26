package streams;

import java.io.File;

public class FileDemo4 {

    public static void main(String[] args) {

        File npciDir = new File("D:\\Trainings\\TalentSprint\\samplecode\\NPCIDec07\\src");

        System.out.println("is File : " + npciDir.isFile());
        System.out.println("is Directory : " + npciDir.isDirectory());

//        String[] list = npciDir.list();
//        for (String s : list){
//            System.out.println(s);
//        }

        File[] files = npciDir.listFiles();
        for (File f : files){
            String type = "";
            if (f.isFile()){
                type = "File";
            }else if (f.isDirectory()){
                type = "Directory";
            }

            System.out.println(f.getName() + " " + type );

        }



    }
}
