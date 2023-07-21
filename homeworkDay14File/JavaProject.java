package homeworkDay14File;

import java.io.*;
import java.util.*;

public class JavaProject {
	private static final String ROOT_DIRECTORY = "documents";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Create the root directory if it doesn't exist
		createRootDirectory();

		int choice;
		do {
			//Switch menu for listing different functions
			System.out.println("File Management System");
			System.out.println("1. Create a new document");
			System.out.println("2. Append content to an existing document");
			System.out.println("3. Create a new directory");
			System.out.println("4. Move a file to a different directory");
			System.out.println("5. List directory contents");
			System.out.println("6. Delete a file");
			System.out.println("7. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); 

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
				moveFile(scanner);
				break;
			case 5:
				listDirectoryContents(scanner);
				break;
			case 6:
				deleteFile(scanner);
				break;
			case 7:
				System.out.println("Exiting the file management system. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		} while (choice != 7);

		scanner.close();
	}

	//Method to create a new director if it does not exist
	private static void createRootDirectory() {
		File rootDirectory = new File(ROOT_DIRECTORY);
		if (!rootDirectory.exists()) {
			if (rootDirectory.mkdir()) {
				System.out.println("Root directory created: " + rootDirectory.getAbsolutePath());
			} else {
				System.out.println("Failed to create root directory.");
				System.exit(1);
			}
		}
	}

	//Method to craete a new document
	private static void createNewDocument(Scanner scanner) {
		System.out.print("Enter the document name: ");
		String documentName = scanner.nextLine();

		System.out.print("Enter the document content: ");
		String content = scanner.nextLine();

		try {
			FileWriter writer = new FileWriter(ROOT_DIRECTORY + File.separator + documentName);
			writer.write(content);
			writer.close();
			System.out.println("Document created successfully.");
		} catch (IOException e) {
			System.out.println("An error occurred while creating the document.");
			e.printStackTrace();
		}
	}

	//Method for appending data into existing document
	private static void appendContentToDocument(Scanner scanner) {
		System.out.print("Enter the name of the document to append content: ");
		String documentName = scanner.nextLine();

		System.out.print("Enter the additional content: ");
		String content = scanner.nextLine();

		try {
			FileWriter writer = new FileWriter(ROOT_DIRECTORY + File.separator + documentName, true);
			writer.write(content);
			writer.close();
			System.out.println("Content appended to the document successfully.");
		} catch (IOException e) {
			System.out.println("An error occurred while appending content to the document.");
			e.printStackTrace();
		}
	}

	//Method for  creating new directory
	private static void createNewDirectory(Scanner scanner) {
		System.out.print("Enter the name of the new directory: ");
		String directoryName = scanner.nextLine();

		File newDirectory = new File(ROOT_DIRECTORY + File.separator + directoryName);
		if (newDirectory.mkdir()) {
			System.out.println("Directory created successfully: " + newDirectory.getAbsolutePath());
		} else {
			System.out.println("Failed to create the directory.");
		}
	}

	//Method for moving file form one dir to other
	private static void moveFile(Scanner scanner) {
		System.out.print("Enter the name of the file to move: ");
		String fileName = scanner.nextLine();

		System.out.print("Enter the name of the destination directory: ");
		String destinationDirectory = scanner.nextLine();

		File fileToMove = new File(ROOT_DIRECTORY + File.separator + fileName);
		File destination = new File(ROOT_DIRECTORY + File.separator + destinationDirectory + File.separator + fileName);

		if (fileToMove.renameTo(destination)) {
			System.out.println("File moved successfully.");
		} else {
			System.out.println("Failed to move the file.");
		}
	}

	//Displaying contents of Directory
	private static void listDirectoryContents(Scanner scanner) {
		System.out.print("Enter the name of the directory: ");
		String directoryName = scanner.nextLine();

		File directory = new File(ROOT_DIRECTORY + File.separator + directoryName);
		if (directory.exists() && directory.isDirectory()) {
			File[] files = directory.listFiles();
			if (files != null) {
				System.out.println("Contents of " + directory.getAbsolutePath() + ":");
				for (File file : files) {
					System.out.println(file.getName());
				}
			}
		} else {
			System.out.println("Directory not found.");
		}
	}

	//Deleting a file
	private static void deleteFile(Scanner scanner) {
		System.out.print("Enter the name of the file to delete: ");
		String fileName = scanner.nextLine();

		File fileToDelete = new File(ROOT_DIRECTORY + File.separator + fileName);
		if (fileToDelete.exists() && fileToDelete.isFile()) {
			if (fileToDelete.delete()) {
				System.out.println("File deleted successfully.");
			} else {
				System.out.println("Failed to delete the file.");
			}
		} else {
			System.out.println("File not found.");
		}
	}
}