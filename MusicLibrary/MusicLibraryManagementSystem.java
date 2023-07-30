package MusicLibrary;

import java.util.Scanner;

/**
 * Represents the Music Library Management System application.
 */
public class MusicLibraryManagementSystem {
   
	public void runMusicLibraryManagementSystem() {
        MusicLibrary musicLibrary = new MusicLibrary();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\n-- Music Library Management System --");
            System.out.println("1. Add a song to the music library");
            System.out.println("2. Create a playlist and add songs to it");
            System.out.println("3. Display all songs in the music library");
            System.out.println("4. Display all playlists and their associated songs");
            System.out.println("5. Find all songs by a specific artist");
            System.out.println("6. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the artist name: ");
                    String artist = scanner.nextLine();
                    System.out.print("Enter the duration in seconds: ");
                    int duration = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    musicLibrary.addSong(title, artist, duration);
                    System.out.println("Song added to the music library.");
                    break;
                case 2:
                    System.out.print("Enter the playlist name: ");
                    String playlistName = scanner.nextLine();
                    musicLibrary.createPlaylist(playlistName);

                    boolean addingSongs = true;
                    while (addingSongs) {
                        System.out.print("Enter the song title to add (or 'done' to finish): ");
                        String songTitle = scanner.nextLine();
                        if (songTitle.equalsIgnoreCase("done")) {
                            addingSongs = false;
                        } else {
                            musicLibrary.addSongToPlaylist(playlistName, songTitle);
                        }
                    }

                    System.out.println("Playlist created and songs added.");
                    break;
                case 3:
                    musicLibrary.displayMusicLibrary();
                    break;
                case 4:
                    musicLibrary.displayPlaylists();
                    break;
                case 5:
                    System.out.print("Enter the artist name: ");
                    String artistName = scanner.nextLine();
                    musicLibrary.findSongsByArtist(artistName);
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Exiting the Music Library Management System.");
        scanner.close();
    }
}

