package homework.homework13.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // fileSearch();
        // contentSearch();
        //findLines();
        // printSizeOfPackage();
        createFileWithContent();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {
        System.out.println("please input file path");
        String path = scanner.nextLine();
        File file = new File(path);
        System.out.println("please input fileName");
        String fileName = scanner.nextLine();
        File file1 = new File(path);
        String[] list = file1.list();
        if (file.exists() && file.isDirectory()) {
            for (String s : list) {
                if (s.equals(fileName)) {
                    System.out.println(true);
                    return;
                }
            }
            System.out.println(false);
        } else System.out.println(false);
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {
        System.out.println("please input path");
        String path = scanner.nextLine();
        File file = new File(path);
        System.out.println("please input keyword");
        String keyWord = scanner.nextLine();
        File[] files = file.listFiles();
        if (file.exists() && file.isDirectory()) {
            for (File f : files) {
                if (f.getName().contains(".txt")) {
                    try (BufferedReader inputStream = new BufferedReader(new FileReader(f))) {
                        String line = "";
                        while ((line = inputStream.readLine()) != null) {
                            if (line.contains(keyWord)) {
                                System.out.println(f.getName());
                            }
                        }
                    } catch (IOException e) {
                        System.err.println("Error " + e);
                    }
                }
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {
        System.out.println("please input textPath");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        System.out.println("please input ketWord");
        String keyWord = scanner.nextLine();
        File[] files = file.listFiles();
        if (file.exists() && file.isDirectory()) {
            for (File f : files) {
                if (f.getName().contains(".txt")) {
                    try (BufferedReader inputStream = new BufferedReader(new FileReader(f))) {
                        String line = "";
                        int x = 1;
                        while ((line = inputStream.readLine()) != null) {
                            if (line.contains(keyWord)) {
                                System.out.println(x + " " + f.getName());
                            }
                            x++;
                        }
                    } catch (IOException e) {
                        System.err.println("Error " + e);
                    }
                }
            }

        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("please input path");
        String path = scanner.nextLine();
        File file = new File(path);
        File[] files = file.listFiles();
        if (file.exists() && file.isDirectory()) {
            long sum = 0;
            for (File list : files) {
                sum += list.length();

            }
            System.out.println("mb " + (sum / 1024) / 1024);
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("please input path " + "\\" + " and file name");
        String path = scanner.nextLine();
        File file = new File(path);
        System.out.println("please input content");
        String content = scanner.nextLine();
        if (!file.exists()) {
            file.createNewFile();
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
                bufferedWriter.write(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}