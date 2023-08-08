package java_Homework.musicLibraryApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Music library class that acts as interface to add songs, create/view
 * playlists
 * 
 * @author U1248069
 *
 */

public class MusicLibrary {
	//New Pull request
	static ArrayList<Song> songs;
	static HashMap<String, ArrayList<Song>> playlists;
	static HashSet<String> artists;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		// collections to store various music attributes
		songs = new ArrayList<Song>();
		playlists = new HashMap<String, ArrayList<Song>>();
		artists = new HashSet<String>();

		// class variables
		String continueProg;
		int choice;
		initialiseMusic();
		System.out.println("Welcome to the Music Library App !!!\n");

		do {

			System.out.println("1. Add song to library");
			System.out.println("2. Create a playlist and add songs to it");
			System.out.println("3. Display all songs");
			System.out.println("4. Display all playlists and associated songs");
			System.out.println("5. Find songs usng artist");
			System.out.println("6. Exit");
			System.out.print("\nPlease enter choice from the above menu: ");
			choice = Integer.parseInt(br.readLine());
			// scan.next();
			
			switch (choice) {

			case 1:
				addSong();
				break;
			case 2:
				createPlayList();
				break;
			case 3:
				displayAllSongs(songs);
				break;
			case 4:
				displayAllPlaylists();
				break;
			case 5:
				searchSongByArtist();
				break;

			case 6:
				System.out.println("Thank you!");
				System.exit(0);

			default:
				System.out.println("Invalid choice");

			}

			/*
			 * System.out.print("\nContinue(y/n): "); continueProg = br.readLine();
			 */
		} while (true);

	}

	/**
	 * Method to add song to the library
	 * 
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void addSong() throws NumberFormatException, IOException {
		// Song Properties
		String title, artist;
		double duration;

		System.out.print("\nPlease enter the Title of the song: ");
		title = br.readLine();
		if (isSongPresentByTitle(title)) {

			System.out.println("Song already present in the list !");

		} else {
			System.out.print("Please enter the Artist of the song: ");
			artist = br.readLine();

			System.out.print("Please enter the duraction of the song: ");
			duration = Double.parseDouble(br.readLine());

			songs.add(new Song(title, artist, duration));
			artists.add(artist);
			System.out.println("Song Added successfully !");
		}

	}

	/**
	 * Checks if the song is present in the list by title
	 * 
	 * @param title
	 * @return
	 */
	public static boolean isSongPresentByTitle(String title) {

		for (Song s : songs) {

			if (s.getTitle().equalsIgnoreCase(title)) {

				return true;

			}

		}
		return false;

	}

	/**
	 * Creates playlist and adds songs to it
	 * 
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void createPlayList() throws NumberFormatException, IOException {

		// Playlist properties
		String playListName, continueAdding;
		int choice, counter = 1;
		System.out.print("\nEnter the playlist name: ");
		playListName = br.readLine();

		ArrayList<Song> songList = new ArrayList<Song>();
		do {
			counter = 1;
			System.out.println("Available songs to be added : ");
			for (Song s : songs) {

				System.out.println(counter + ":'" + s.getTitle() + "' by " + s.getArtist());
				counter++;

			}

			System.out.print("\nEnter your choice: ");
			choice = Integer.parseInt(br.readLine());

			songList.add(songs.get(choice - 1));
			System.out.print("Add more songs(y/n): ");
			continueAdding = br.readLine();

		} while (continueAdding.equalsIgnoreCase("y"));

		playlists.put(playListName, songList);
		System.out.println("PlayList created successfully !!");
	}

	/**
	 * Method to display all songs
	 * 
	 * @param songList
	 */
	public static void displayAllSongs(ArrayList<Song> songList) {

		int counter = 1;

		for (Song s : songList) {

			System.out.println("Song " + counter);
			s.displayDetails();
			System.out.println("------------------------------------");
			counter++;
		}
	}

	/**
	 * Method to display all playlist and its corresponding songs
	 */
	public static void displayAllPlaylists() {

		int counter1 = 1;
		String playListName;
		Iterator i = playlists.entrySet().iterator();
		Map.Entry mapElement;
		while (i.hasNext()) {
			mapElement = (Map.Entry) i.next();
			System.out.println("\n\nPlaylist " + counter1 + ": " + mapElement.getKey());
			System.out.println();
			displayAllSongs(playlists.get(mapElement.getKey()));
			System.out.println("=============================================");
			counter1++;

		}
	}

	/**
	 * Searches song with respect to Artist
	 * 
	 * @throws IOException
	 */

	public static void searchSongByArtist() throws IOException {

		String artistName;
		ArrayList<Song> songByArtist = new ArrayList<Song>();
		System.out.println("Available artists: " + artists);
		System.out.print("Enter the artist: ");
		artistName = br.readLine();
		for (Song s : songs) {

			if (s.getArtist().equalsIgnoreCase(artistName)) {
				songByArtist.add(s);
			}
		}

		if (songByArtist.isEmpty()) {
			System.out.println("No songs found by the artist");
		} else {
			System.out.println("Please find the songs by the artist as below:");
			displayAllSongs(songByArtist);
		}
	}

	/**
	 * Adds default music to Music Library
	 */
	public static void initialiseMusic() {

		songs.add(new Song("Sanedo", "Falguni Pathak", 4.21));
		songs.add(new Song("The Lion Sleeps tonight", "The Tokens", 2.40));
		songs.add(new Song("I'll be there for you", "Why Everyone Left", 3.14));
		songs.add(new Song("Pari Hu Me", "Falguni Pathak", 3));

		artists.add("Falguni Pathak");
		artists.add("The Tokens");
		artists.add("Why Everyone Left");

	}

}
