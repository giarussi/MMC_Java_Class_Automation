
package FileIO;
import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.io.IOException;
public class FileIO  {

	static String   path=  "C:\\Users\\u1230894\\OneDrive - MMC\\SW\\HW";   


	public static void writeFile() throws IOException,FileNotFoundException {



		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\u1230894\\OneDrive - MMC\\SW\\HW\\WriteFileOutpu.txt"));



		bw.write("qwerty");

		bw.write("\nnotepad");

		bw.close();



	}

	public static void ListFile(String Path) throws IOException {



		File maindir=new File(Path);
		// File arr[]   = maindir.listFiles();
		File[] filesList = maindir.listFiles();

		String contents[] = maindir.list();
		System.out.println("List of files and directories in the specified directory:");
		for(int i=0; i<contents.length; i++) {
			System.out.println(contents[i]);
		}


	}

	public static void readFile() throws IOException {



		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\u1230894\\OneDrive - MMC\\SW\\HW\\WriteFileOutpu.txt"));

		String s;



		while ((s = br.readLine()) != null) {

			System.out.println(s);

		}



		br.close();



	}



	public static void createNewFile(String name) throws IOException {
		try {
			File Obj = new File(path.concat("\\"+name+".txt"));
			if (Obj.createNewFile()) {
				System.out.println("File created: "
						+ Obj.getName());
			}
			else {
				System.out.println("File already exists.");
			}
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}



	public static void copyPasteFile() throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\u1230894\\OneDrive - MMC\\SW\\HW\\WriteFileOutpu.txt"));



		BufferedWriter bw = new BufferedWriter(

				new FileWriter("C:\\Users\\u1230894\\OneDrive - MMC\\SW\\HW\\WriteFileOutpu.txt"));

		System.out.println("=============");

		String s;

		while ((s = br.readLine()) != null) {



			bw.write(s + "\n");



		}



		bw.close();



	}



	public static void appendFIle(String nme,String txt) throws IOException {
		try{

			String new_path=path.concat("\\"+nme+".txt");

			BufferedWriter bw = new BufferedWriter(

					new FileWriter(new_path, true));



			bw.write("\n"+txt);
			if(txt != null)
			{
				System.out.println("File  appended  successfully");
			}
			else
			{
				System.out.println("Failed to append the file");
			}
			bw.close();
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			//  e.printStackTrace();
		}






	}


	// moving a file permanently to a new location
	public static void movefile(String path1,String path2) throws IOException,FileAlreadyExistsException {
		try
		{
			Path temp = Files.move
					(Paths.get(path1),Paths.get(path2));//, StandardCopyOption.ATOMIC_MOVE);

			if(temp != null)
			{
				System.out.println("File  moved successfully");
			}
			else
			{
				System.out.println("Failed to move the file");
			}
		}
		catch (NoSuchFileException e) {
			System.out.println("Source/target does  not  exist.");
		}
		catch (FileAlreadyExistsException e) {
			System.out.println(path1 + "  already exists.  Move failed.");
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}

	public static void createdir(String text) throws IOException {

		String dirName = path.concat("\\"+text);//"c:/temp/data";
		Path path = Paths.get(dirName);

		//1
		if (!Files.exists(path)) {
			Files.createDirectory(path);
			System.out.println("Created the directory: " + text);
		}

		Files.createDirectories(path);

		System.out.println("Failed to create  the directory: " + text);

	}


	public static void delfile(String nme) throws IOException  {

		File myObj = new File(path.concat("\\"+nme+".txt")); 
		if (myObj.delete()) { 
			System.out.println("Deleted the File: " + myObj.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}
	}


	public FileIO() {
		String root = "Documents";
		File f = new File(root);
		if (!f.exists() || !f.isDirectory()) {
			f.mkdir();
			System.out.println("Root Directory created successfully !!");

		} else {
			System.out.println("Root Directory present !!");
		}
	}


}