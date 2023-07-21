package homeworkDay12Music;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		MusicLibrary musicLibrary = new MusicLibrary();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// Menu to perform different function in Music App
			System.out.println("\n-----------Music Library Menu ----------");
			System.out.println("1. Add a song to the music library");
			System.out.println("2. Create a playlist and add songs to it");
			System.out.println("3. Display all songs in the music library");
			System.out.println("4. Display all playlists and their associated songs");
			System.out.println("5. Find all songs by a specific artist");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			// Switc case for adding a new song
			case 1:
				System.out.print("Enter song title: ");
				String title = scanner.nextLine();
				System.out.print("Enter artist name: ");
				String artist = scanner.nextLine();
				System.out.print("Enter duration (in seconds): ");
				int duration = scanner.nextInt();
				scanner.nextLine();
				Song song = new Song(title, artist, duration);
				musicLibrary.addSong(song);
				System.out.println("Song added to the music library.");
				break;

			// Switch case for creating a new playlist
			case 2:
				System.out.print("Enter playlist name: ");
				String playlistName = scanner.nextLine();
				List<Song> playlistSongs = new ArrayList<>();
				System.out.println("Enter song titles to add to the playlist (type 'done' when finished):");
				while (true) {
					String songTitle = scanner.nextLine();
					if (songTitle.equalsIgnoreCase("done")) {
						break;
					}
					System.out.print("Enter artist name for " + songTitle + ": ");
					String songArtist = scanner.nextLine();
					System.out.print("Enter duration (in seconds) for " + songTitle + ": ");
					int songDuration = scanner.nextInt();
					scanner.nextLine();
					Song playlistSong = new Song(songTitle, songArtist, songDuration);
					playlistSongs.add(playlistSong);
				}
				musicLibrary.createPlaylist(playlistName, playlistSongs);
				System.out.println("Playlist created and songs added to it.");
				break;

			// Switch case for displays all songs in library
			case 3:
				System.out.println("All songs in the music library:");
				musicLibrary.displayAllSongs();
				break;

			// Switch case for displaying all playlists
			case 4:
				System.out.println("All playlists and their associated songs:");
				musicLibrary.displayAllPlaylists();
				break;

			// Switch case for searching songs with artist name
			case 5:
				System.out.print("Enter artist name to find songs: ");
				String artistToFind = scanner.nextLine();
				List<Song> songsByArtist = musicLibrary.findSongsByArtist(artistToFind);
				System.out.println("\nSongs by " + artistToFind + ":");
				for (Song songByArtist : songsByArtist) {
					System.out.println(songByArtist.toString());
				}
				break;

			// Switch case for exiting from App
			case 6:
				System.out.println("Exiting music library...");
				System.exit(0);

				// Switch case for Invalid choice
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
