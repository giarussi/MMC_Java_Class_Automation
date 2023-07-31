package Music_Libarary_app;

import java.util.Scanner;

public class MusicLibrary_Main {

	public static void main(String[] args) {
		
		Music_Library_Methods library = new Music_Library_Methods();
String flag=null;
Scanner scanner = new Scanner(System.in);
		do {

			System.out.println("Enter the choice    1.Add Songs  2.Create Playlist  3.Disply songs   4.Display all playlists "+"\n"+ "5.Find all songs ");

            int choice  = scanner.nextInt();

            scanner.nextLine();

 

            // switch to accept different inputs from user 

            switch (choice) {
            
            case 1:
            	System.out.println("Enter the song u want to add");
            	String  songs  = scanner.next();
            	System.out.println("Enter the artist name");
            	String  songs1  = scanner.next();
            	
            	library.addSong(new Songs_Library(songs,songs1));
            	break;
            	
            case 2:
            	System.out.println("Enter the name  of playlist");
            	String playlist   = scanner.next();
            	library.createPlaylist(playlist);
            	
            	System.out.println("Enter the no of song u want to add to playlist");
            	int  list1  = scanner.nextInt();
            	
            	for (int i = 0; i < list1; i++) {
					System.out.println("Enter the Song  ");
					String playlist1 = scanner.next();
					System.out.println("Enter the artist name ");
					String playlist2 = scanner.next();
					library.addSongToPlaylist(playlist, new Songs_Library(playlist1, playlist2));
				}
				break;
            case 3:
            	System.out.println("We will display all Songs  ");
            	library.displayAllSongs();
            	break;
            case 4:
            	System.out.println("We will display all playlists  ");
            	library.displayAllPlaylists();
            break;
            case 5:
            	System.out.println("Enter the name of the artist to search song ");
            	String Artist1 = scanner.next();
            	library.findSongsByArtist(Artist1);
            	break;
            	
            }
			   System.out.println("Do you want to continue  ?");

	            flag = scanner.next();

			        } while (flag.equalsIgnoreCase("Y"));
	}
	
	
	
}
