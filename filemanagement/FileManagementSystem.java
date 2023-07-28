package filemanagement;

import java.io.*;
import java.util.Scanner;

public class FileManagementSystem {
    private static final String ROOT_DIRECTORY_NAME = "documents";
    private static final String SEPARATOR = File.separator;
    private static final String ROOT_DIRECTORY_PATH = System.getProperty("user.dir") + SEPARATOR + ROOT_DIRECTORY_NAME;

    public static void main(String[] args) {
        // Create the root directory if it doesn't exist
        createRootDirectoryIfNotExists();

        // Main loop to prompt user for file management operations
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            switch (choice) {
                case 1:
                    createNewDocument(scanner);
                    break;
                case 2:
                    appendToExistingDocument(scanner);
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
                    System.out.println("Exiting the file management system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }

    // Methods for various file management operations

    // Method to create a new document in the root directory
    private static void createNewDocument(Scanner scanner) {
        System.out.print("Enter the document name: ");
        String docName = scanner.nextLine();
        System.out.print("Enter the document content: ");
        String content = scanner.nextLine();

        String filePath = ROOT_DIRECTORY_PATH + SEPARATOR + docName;
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write(content);
            fileWriter.close();
            System.out.println("Document created successfully!");
        } catch (IOException e) {
            System.out.println("Error creating the document: " + e.getMessage());
        }
    }

    // Method to append content to an existing document in the root directory
    private static void appendToExistingDocument(Scanner scanner) {
        System.out.print("Enter the name of an existing document: ");
        String docName = scanner.nextLine();
        System.out.print("Enter additional content: ");
        String content = scanner.nextLine();

        String filePath = ROOT_DIRECTORY_PATH + SEPARATOR + docName;
        File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            try {
                FileWriter fileWriter = new FileWriter(file, true); // Append mode
                fileWriter.write(content);
                fileWriter.close();
                System.out.println("Content appended to the document successfully!");
            } catch (IOException e) {
                System.out.println("Error appending to the document: " + e.getMessage());
            }
        } else {
            System.out.println("File not found. Please check the name and try again.");
        }
    }

    // Method to create a new directory in the root directory
    private static void createNewDirectory(Scanner scanner) {
        System.out.print("Enter the name of a new directory: ");
        String dirName = scanner.nextLine();

        String dirPath = ROOT_DIRECTORY_PATH + SEPARATOR + dirName;
        File newDirectory = new File(dirPath);
        if (newDirectory.mkdir()) {
            System.out.println("Directory created successfully!");
        } else {
            System.out.println("Error creating the directory. Please check the directory name.");
        }
    }

    // Method to move a file from the root directory to another directory
    private static void moveFileToDirectory(Scanner scanner) {
        System.out.print("Enter the name of the file to move: ");
        String fileName = scanner.nextLine();
        System.out.print("Enter the name of the destination directory: ");
        String destDirName = scanner.nextLine();

        String sourceFilePath = ROOT_DIRECTORY_PATH + SEPARATOR + fileName;
        String destDirPath = ROOT_DIRECTORY_PATH + SEPARATOR + destDirName;
        File sourceFile = new File(sourceFilePath);
        File destDir = new File(destDirPath);

        if (sourceFile.exists() && sourceFile.isFile() && destDir.exists() && destDir.isDirectory()) {
            File destFile = new File(destDir, fileName);
            if (sourceFile.renameTo(destFile)) {
                System.out.println("File moved successfully to the destination directory!");
            } else {
                System.out.println("Error moving the file. Please check the file and destination directory names.");
            }
        } else {
            System.out.println("File or destination directory not found. Please check the names and try again.");
        }
    }

    // Method to list the contents of a directory
    private static void listDirectoryContents(Scanner scanner) {
        System.out.print("Enter the name of the directory: ");
        String dirName = scanner.nextLine();

        String dirPath = ROOT_DIRECTORY_PATH + SEPARATOR + dirName;
        File directory = new File(dirPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null && files.length > 0) {
                System.out.println("Contents of directory '" + dirName + "':");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("Directory not found. Please check the name and try again.");
        }
    }

    // Method to delete a file from the root directory
    private static void deleteFile(Scanner scanner) {
        System.out.print("Enter the name of the file to delete: ");
        String fileName = scanner.nextLine();

        String filePath = ROOT_DIRECTORY_PATH + SEPARATOR + fileName;
        File fileToDelete = new File(filePath);

        if (fileToDelete.exists() && fileToDelete.isFile()) {
            if (fileToDelete.delete()) {
                System.out.println("File deleted successfully!");
            } else {
                System.out.println("Error deleting the file. Please check the file name and try again.");
            }
        } else {
            System.out.println("File not found. Please check the name and try again.");
        }
    }

    // Helper methods

    // Method to display the file management menu
    private static void showMenu() {
        // Display the menu options
        System.out.println("\nFile Management System Menu:");
        System.out.println("1. Create a new document");
        System.out.println("2. Append content to an existing document");
        System.out.println("3. Create a new directory");
        System.out.println("4. Move a file to a different directory");
        System.out.println("5. List directory contents");
        System.out.println("6. Delete a file");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    // Method to create the root directory if it doesn't exist
    private static void createRootDirectoryIfNotExists() {
        File rootDirectory = new File(ROOT_DIRECTORY_PATH);
        if (!rootDirectory.exists()) {
            rootDirectory.mkdir();
        }
    }
}
