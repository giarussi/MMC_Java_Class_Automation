package FileMgmnt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Class variables
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice;
		System.out.println("Welcome to the File Management System !!");
		FileClass f = new FileClass();
		do {
			// File Management menu
			System.out.println("\nFile Management Actions:");
			System.out.println("1. Create a new document");
			System.out.println("2. Append content to an existing document");
			System.out.println("3. Create a new Directory");
			System.out.println("4. Movie File");
			System.out.println("5. List all files");
			System.out.println("6. Delete a file");
			System.out.println("7. Exit ");

			System.out.print("Please enter your choice: ");
			choice = Integer.parseInt(br.readLine());
			System.out.println();
			switch (choice) {
			case 1:
				try {
					f.createFile();

				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());

				}
				break;
			case 2:
				try {
					f.appendFile();

				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());

				}
				break;
			case 3:
				try {
					f.createDirectory();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;

			case 4:
				try {
					f.moveFile();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				try {
					f.listFile();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				try {
					f.deleteFile();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
				break;
			case 7:
				System.out.println("Thank you for using the system.");
				System.exit(0);
			}

		} while (true);
	}

}