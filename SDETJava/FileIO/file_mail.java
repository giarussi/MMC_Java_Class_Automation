package FileIO;

import java.io.IOException;
import java.util.Scanner;

public class file_mail {

	public static void main(String args[]) throws IOException {
		FileIO filo=new FileIO();
		String flag=null;	 
		Scanner scanner = new Scanner(System.in);
		do {

//Logic to chose action based on input

			System.out.println("Enter the number for type of operation you want to perform  "
					+ " 1.CreateFile  2.Appendfile  3.Create directory  4.Movefile"+"\n"+ "5.list of files  6.delete file  7.Exit ");

			int choice  = scanner.nextInt();

			scanner.nextLine();
			// switch to accept different type of options

			switch (choice) {

			case 1:

				System.out.println("Enter the name  of file you want to create ");

				String name=scanner.next();
				filo.createNewFile(name);
				break;

			case 2:

				System.out.println("Enter the name of  file  ");

				String text=scanner.nextLine();
				System.out.println("Enter the text to append in file  ");

				String text1=scanner.nextLine();

				filo.appendFIle(text,text1);
				break;
			case 3:

				System.out.println("Enter the name of  directory you want to create  ");

				String text11=scanner.nextLine();

				filo.createdir(text11);
				break;
			case 4:

				System.out.println("Enter the   file path source  ");

				String text_1=scanner.nextLine();
				System.out.println("Enter the   file Destination ");

				String text_2=scanner.nextLine();

				filo.movefile(text_1,text_2);
				break;

			case 5:  System.out.println("Enter path  of files");
			String text5=scanner.nextLine();
			filo.ListFile(text5);
			break;
			case 6:  System.out.println("Enter name   of file to be deleted");
			String text6=scanner.nextLine();
			filo.delfile(text6);
			break;
			case 7:  System.out.println("Exit");
			System.exit(0);            
			break;

			}            System.out.println("Do you want to continue  ?");

			flag = scanner.next();

		} while (flag.equalsIgnoreCase("Y"));


	}


}
