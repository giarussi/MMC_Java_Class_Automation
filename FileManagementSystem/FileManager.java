package FileManagementSystem;

import java.io.*;
import java.util.Scanner;


public class FileManager {

    private static final String ROOT_DIRECTORY = "C://prac/";

    public static void main(String[] args) {
        createRootDirectoryIfNotExists();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            printMenu();
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (option) {
                case 1:
                    createNewDocument(scanner);
                    break;
                case 2:
                    appendContentToDocument(scanner);
                    break;
                case 3:
                    createNewDirectory(scanner);
                    break;
                case 4:
                    moveFileToDirectory(scanner);
                    break;
                case 5:
                    listDirectoryContents(scanner);
                    break;
                case 6:
                    deleteFile(scanner);
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    /**
     * Print the menu options for the file management system.
     */
    private static void printMenu() {
        System.out.println("File Management System Menu:");
        System.out.println("1. Create a new document");
        System.out.println("2. Append content to an existing document");
        System.out.println("3. Create a new directory");
        System.out.println("4. Move a file to a different directory");
        System.out.println("5. List directory contents");
        System.out.println("6. Delete a file");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    /**
     * Creates the root directory if it doesn't exist.
     */
    private static void createRootDirectoryIfNotExists() {
        File rootDir = new File(ROOT_DIRECTORY);
        if (!rootDir.exists()) {
            rootDir.mkdir();
        }
    }

    /**
     * Creates a new document with user-provided content in the root directory.
     *
     * @param scanner Scanner object to read user input.
     */
    private static void createNewDocument(Scanner scanner) {
        System.out.print("Enter the document name: ");
        String documentName = scanner.nextLine();
        String filePath = ROOT_DIRECTORY + documentName;

        try (PrintWriter writer = new PrintWriter(filePath)) {
            System.out.println("Enter the content (Type 'END_OF_DOCUMENT' on a new line to finish): ");
            while (true) {
                String line = scanner.nextLine();
                if (line.equalsIgnoreCase("END_OF_DOCUMENT")) {
                    break;
                }
                writer.println(line);
            }
            System.out.println("Document created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating the document: " + e.getMessage());
        }
    }


    /**
     * Appends additional content to an existing document.
     *
     * @param scanner Scanner object to read user input.
     */
    private static void appendContentToDocument(Scanner scanner) {
        System.out.print("Enter the name of the existing document: ");
        String documentName = scanner.nextLine();
        String filePath = ROOT_DIRECTORY + documentName;

        try (FileWriter writer = new FileWriter(filePath, true)) {
            System.out.println("Enter the additional content (Type 'END_OF_DOCUMENT' on a new line to finish): ");
            while (true) {
            	String line = scanner.nextLine();
                
                if (line.equalsIgnoreCase("END_OF_DOCUMENT")) {
                    break;
                }
                writer.write(scanner.nextLine() + System.lineSeparator());
                
            }
            System.out.println("Content appended successfully.");
        } catch (IOException e) {
            System.out.println("Error appending content: " + e.getMessage());
        }
    }

    /**
     * Creates a new directory within the root directory.
     *
     * @param scanner Scanner object to read user input.
     */
    private static void createNewDirectory(Scanner scanner) {
        System.out.print("Enter the name of the new directory: ");
        String directoryName = scanner.nextLine();
        String directoryPath = ROOT_DIRECTORY + directoryName;

        File newDirectory = new File(directoryPath);
        if (newDirectory.mkdir()) {
            System.out.println("Directory created successfully.");
        } else {
            System.out.println("Error creating the directory.");
        }
    }

    /**
     * Moves a file to a different directory within the root directory.
     *
     * @param scanner Scanner object to read user input.
     */
    private static void moveFileToDirectory(Scanner scanner) {
        System.out.print("Enter the name of the file to move: ");
        String sourceFileName = scanner.nextLine();
        String sourceFilePath = ROOT_DIRECTORY + sourceFileName;

        System.out.print("Enter the name of the destination directory: ");
        String destinationDirectoryName = scanner.nextLine();
        String destinationDirectoryPath = ROOT_DIRECTORY + destinationDirectoryName;

        File sourceFile = new File(sourceFilePath);
        File destinationDirectory = new File(destinationDirectoryPath);

        if (sourceFile.exists() && destinationDirectory.exists() && destinationDirectory.isDirectory()) {
            String destinationFilePath = destinationDirectoryPath + "/" + sourceFileName;
            if (sourceFile.renameTo(new File(destinationFilePath))) {
                System.out.println("File moved successfully.");
            } else {
                System.out.println("Error moving the file.");
            }
        } else {
            System.out.println("File or destination directory not found.");
        }
    }

    /**
     * Lists the contents of a directory within the root directory.
     *
     * @param scanner Scanner object to read user input.
     */
    private static void listDirectoryContents(Scanner scanner) {
        System.out.print("Enter the name of the directory to list: ");
        String directoryName = scanner.nextLine();
        String directoryPath = ROOT_DIRECTORY + directoryName;

        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null && files.length > 0) {
                System.out.println("Contents of " + directoryName + ":");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("Directory not found.");
        }
    }

    /**
     * Deletes a file from the root directory.
     *
     * @param scanner Scanner object to read user input.
     */
    private static void deleteFile(Scanner scanner) {
        System.out.print("Enter the name of the file to delete: ");
        String fileName = scanner.nextLine();
        String filePath = ROOT_DIRECTORY + fileName;

        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Error deleting the file.");
            }
        } else {
            System.out.println("File not found.");
        }
    }
}
