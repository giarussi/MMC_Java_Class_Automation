package Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileManagementSystem {
    private static final String ROOT_DIRECTORY = "documents";

    public static void main(String[] args) {
        createRootDirectory();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
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
                    listDirectoryContent(scanner);
                    break;
                case 6:
                    deleteFile(scanner);
                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("File Management System Menu");
        System.out.println("1. Create a new document");
        System.out.println("2. Append content to an existing document");
        System.out.println("3. Create a new directory");
        System.out.println("4. Move a file to a different directory");
        System.out.println("5. List directory content");
        System.out.println("6. Delete a file");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void createRootDirectory() {
        // Create the root directory if it doesn't exist
        File rootDirectory = new File(ROOT_DIRECTORY);
        if (!rootDirectory.exists()) {
            rootDirectory.mkdir();
        }
    }

    private static void createNewDocument(Scanner scanner) {
        System.out.print("Enter the document name: ");
        String documentName = scanner.nextLine();
        String documentPath = ROOT_DIRECTORY + File.separator + documentName;

        System.out.print("Enter the document content: ");
        String documentContent = scanner.nextLine();

        try (FileWriter writer = new FileWriter(documentPath)) {
            // Create a new document with the given name and content
            writer.write(documentContent);
            System.out.println("Document created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the document.");
        }
    }

    private static void appendContentToDocument(Scanner scanner) {
        System.out.print("Enter the name of the existing document: ");
        String documentName = scanner.nextLine();
        String documentPath = ROOT_DIRECTORY + File.separator + documentName;

        System.out.print("Enter the additional content: ");
        String additionalContent = scanner.nextLine();

        try (FileWriter writer = new FileWriter(documentPath, true)) {
            // Append new content to an existing document
            writer.write(additionalContent);
            System.out.println("Content appended to the document successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending content to the document.");
        }
    }

    private static void createNewDirectory(Scanner scanner) {
        System.out.print("Enter the name of the new directory: ");
        String directoryName = scanner.nextLine();
        String directoryPath = ROOT_DIRECTORY + File.separator + directoryName;

        try {
            // Create a new directory with the given name
            Files.createDirectory(Paths.get(directoryPath));
            System.out.println("Directory created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the directory.");
        }
    }

    private static void moveFileToDirectory(Scanner scanner) {
        System.out.print("Enter the name of the file to move: ");
        String fileName = scanner.nextLine();
        String sourceFilePath = ROOT_DIRECTORY + File.separator + fileName;

        System.out.print("Enter the name of the destination directory: ");
        String destinationDirectoryName = scanner.nextLine();
        String destinationDirectoryPath = ROOT_DIRECTORY + File.separator + destinationDirectoryName;

        try {
            // Move a file to a different directory
            File destinationDirectory = new File(destinationDirectoryPath);
            if (!destinationDirectory.exists()) {
                destinationDirectory.mkdir();
            }

            Path source = Paths.get(sourceFilePath);
            Path destination = Paths.get(destinationDirectoryPath + File.separator + fileName);

            Files.move(source, destination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while moving the file.");
        }
    }

    private static void listDirectoryContent(Scanner scanner) {
        System.out.print("Enter the name of the directory: ");
        String directoryName = scanner.nextLine();
        String directoryPath = ROOT_DIRECTORY + File.separator + directoryName;

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(directoryPath))) {
            // List files and subdirectories within a specified directory
            System.out.println("Directory Content:");
            for (Path path : directoryStream) {
                System.out.println(path.getFileName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while listing directory content.");
        }
    }

    private static void deleteFile(Scanner scanner) {
        System.out.print("Enter the name of the file to delete: ");
        String fileName = scanner.nextLine();
        String filePath = ROOT_DIRECTORY + File.separator + fileName;

        try {
            // Delete a specified file
            Files.deleteIfExists(Paths.get(filePath));
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while deleting the file.");
        }
    }
}
