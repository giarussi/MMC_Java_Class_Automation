package java_Homework.FileManagement;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

/**
 * Custom File class to perform file management
 * 
 * @author U1248069
 *
 */
public class FileClass {

	private String root;

	// Constructor to create root directory
	public FileClass() {
		root = "Documents";
		File f = new File(root);
		if (!f.exists() || !f.isDirectory()) {
			f.mkdir();
			System.out.println("Root Directory created successfully !!");

		} else {
			System.out.println("Root Directory present !!");
		}
	}

	/**
	 * Method to delete files.
	 * 
	 * @throws IOException
	 */
	public void deleteFile() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		listFile();
		System.out.print("Enter the name of the file to be deleted(with extension): ");
		String fileName = br.readLine();

		File f = new File(root + "\\" + fileName);

		f.delete();

		System.out.println("File deleted sucessfully !!");
	}

	/**
	 * Method used to move file
	 * 
	 * @throws IOException
	 */
	public void moveFile() throws IOException {
		listFile();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the name of the file to be deleted(with extension): ");
		String fileName = br.readLine();

		System.out.print("Enter the name of folder in which file is to be moved: ");
		String newFolder = br.readLine();

		File f = new File(root + "\\" + fileName);
		if (f.renameTo(new File(root + "\\" + newFolder + "\\" + fileName))) {
			// if file copied successfully then delete the original file
			f.delete();
			System.out.println("File moved successfully");
		} else {
			System.out.println("Failed to move the file");
		}

	}

	/**
	 * Method used to list files in root directory
	 * 
	 * @throws FileNotFoundException
	 */
	public void listFile() throws FileNotFoundException {
		ArrayList<File> files = getAllFiles(new File(root));
		if (files.isEmpty()) {
			throw new FileNotFoundException("No Files Present");
		} else {
			System.out.println("Files: ");
			for (File f : files) {
				System.out.println(f.getName());
			}
		}

	}

	/**
	 * Method to get all files in root
	 * 
	 * @param rootPath
	 * @return
	 */
	public ArrayList<File> getAllFiles(File rootPath) {
		ArrayList<File> files = new ArrayList<File>();
		File[] filesList = rootPath.listFiles();
		for (File f : filesList) {
			/*
			 * if (f.isDirectory()) files.addAll(getAllFiles(f)); if (f.isFile()) {
			 * files.add(f); }
			 */

			files.add(f);
		}

		return files;
	}

	/**
	 * Method to append contents to an existing file
	 * 
	 * @throws IOException
	 */
	public void appendFile() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the name of the file to be appended without extension: ");
		String fileName = br.readLine();

		ArrayList<File> fileList = getAllFiles(new File(root));
		boolean found = false;
		for (File f : fileList) {

			if (f.getName().toLowerCase().contains(fileName.toLowerCase())) {

				found = true;
				System.out.print("Enter the content to be appended: ");
				String contents = br.readLine();
				BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
				bw.write("\n" + contents);
				bw.close();

				break;

			}
		}

		if (found) {
			System.out.println("File Appended successfully !!");
		} else {
			throw new FileNotFoundException("The file which you are trying to append is not available !");
		}
	}

	/**
	 * Method to create a directory
	 * 
	 * @throws IOException
	 */
	public void createDirectory() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Directory name: ");
		String choice = br.readLine();
		File f = new File(root + "\\" + choice);
		if (!f.exists() || !f.isDirectory()) {
			f.mkdir();
			System.out.println("Directory created successfully !!");

		} else {
			System.out.println("Directory exists already !!");
		}

	}

	/**
	 * Method to create a file
	 * 
	 * @throws IOException
	 */
	public void createFile() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String choice;

		System.out.print("Please enter the file name(without extesnsion): ");
		String fileName = br.readLine();

		System.out.print("Please enter the file contents: ");
		String content = br.readLine();

		File f = new File(root);

		f = new File(root + "\\" + fileName + ".txt");
		BufferedWriter bw;
		if (f.exists()) {
			System.out.print("File Already exists. Press 'y' to append and 'n' to overwrite: ");
			choice = br.readLine();

			if (choice.equalsIgnoreCase("y")) {
				bw = new BufferedWriter(new FileWriter(f, true));
				bw.write("\n" + content);
				bw.close();
				System.out.println("File Append successfully !!");
			} else {
				bw = new BufferedWriter(new FileWriter(f));
				bw.write(content);
				bw.close();
				System.out.println("File Created successfully !!");
			}
		} else {
			bw = new BufferedWriter(new FileWriter(f));
			bw.write(content);
			bw.close();
			System.out.println("File Created successfully !!");
		}

	}

}
