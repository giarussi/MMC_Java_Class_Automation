package homework;
import java.util.*;
import java.io.*;
import java.nio.file.*;

public class FileManagment {
    static final String ROOT_DIR = "documents";
    
    public static void main(String[] args) throws IOException {
        createRootDirectoryIfNotExist();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Select an option:\n1.Create a document\n2.Append to a document\n3.Create a directory\n4.Move a file\n5.List directory\n6.Delete a file\n7.Exit");
            int option = sc.nextInt();
            sc.nextLine(); 
            switch (option) {
                case 1:
                    createDocument(sc);
                    break;
                case 2:
                    appendToDocument(sc);
                    break;
                case 3:
                    createDirectory(sc);
                    break;
                case 4:
                    moveFile(sc);
                    break;
                case 5:
                    listDirectory(sc);
                    break;
                case 6:
                    deleteFile(sc);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
    
    static void createRootDirectoryIfNotExist() throws IOException {
        Files.createDirectories(Paths.get(ROOT_DIR));
    }

    static void createDocument(Scanner sc) throws IOException {
        System.out.println("Enter document name:");
        String fileName = sc.nextLine();
        System.out.println("Enter content:");
        String content = sc.nextLine();
        Files.write(Paths.get(ROOT_DIR, fileName), content.getBytes());
        System.out.println("Document created");
    }

    static void appendToDocument(Scanner sc) throws IOException {
        System.out.println("Enter document name:");
        String fileName = sc.nextLine();
        System.out.println("Enter content to append:");
        String content = sc.nextLine();
        Files.write(Paths.get(ROOT_DIR, fileName), content.getBytes(), StandardOpenOption.APPEND);
        System.out.println("Document updated");
    }

    static void createDirectory(Scanner sc) throws IOException {
        System.out.println("Enter directory name:");
        String dirName = sc.nextLine();
        Files.createDirectories(Paths.get(ROOT_DIR, dirName));
        System.out.println("Directory created");
    }

    static void moveFile(Scanner sc) throws IOException {
        System.out.println("Enter source file name:");
        String sourceFileName = sc.nextLine();
        System.out.println("Enter destination directory name:");
        String destinationDirName = sc.nextLine();
        Files.move(Paths.get(ROOT_DIR, sourceFileName), Paths.get(ROOT_DIR, destinationDirName, sourceFileName));
        System.out.println("File moved");
    }

    static void listDirectory(Scanner sc) throws IOException {
        System.out.println("Enter directory name:");
        String dirName = sc.nextLine();
        Files.list(Paths.get(ROOT_DIR, dirName)).forEach(System.out::println);
    }

    static void deleteFile(Scanner sc) throws IOException {
        System.out.println("Enter file name to delete:");
        String fileName = sc.nextLine();
        Files.deleteIfExists(Paths.get(ROOT_DIR, fileName));
        System.out.println("File deleted");
    }
}

