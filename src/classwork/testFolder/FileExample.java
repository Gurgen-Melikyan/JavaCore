package classwork.testFolder;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {


        String directoryPath = "C:\\Users\\ASUS\\IdeaProjects\\Java Core\\src\\classwork\\testFolder";
        String path = "C:\\Users\\ASUS\\IdeaProjects\\Java Core\\src\\classwork\\testFolder\\poxos.txt";
        File file = new File(directoryPath);
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
            if (f.equals("asdf")) {
                System.out.println(true);
            }

//        System.out.println("isDirectory: " + file.isDirectory());
//        System.out.println("isFile: " + file.isFile());
//        System.out.println(file.length());
//
//
//        System.out.println(File.separator);
//
//
//        File directory = new File(directoryPath);
//        if (!directory.exists()) {
//            directory.mkdir();
////        }
//            File[] files = directory.listFiles();
//
//
//            for (File f : files) {
//                if (f.isFile()) {
//                    System.out.print(f.getName());
//                    System.out.println(f.length());
//                }
//            }

//        long freeSpace = file.getFreeSpace();
//        System.out.println(freeSpace);

//        if (file.exists()){
//            System.out.println("file exists:");
//        }else {
//            boolean newFile = file.createNewFile();
//            if (newFile){
//                System.out.println("File created");
//            }else {
//                System.out.println("File is not created");
//            }
//        }

        }
    }
}