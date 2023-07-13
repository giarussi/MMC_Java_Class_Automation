package musicLibraryHomework;

import java.util.Scanner;

public class MusicLibraryApp {
    public static void main(String[] args) {
        Library library = new Library(); // Create an instance of the Library class
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        while (true) {
            // Display the menu options
            System.out.println("=== Music Library Management System ===");
            System.out.println("1. Add a song to the music library");
            System.out.println("2. Create a playlist and add songs to it");
            System.out.println("3. Display all songs in the music library");
            System.out.println("4. Display all playlists and their associated songs");
            System.out.println("5. Find all songs by a specific artist");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine()); // Read the user's choice
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a number.");
                System.out.println();
                continue;
            }

            switch (choice) {
                case 1:
                    // Add a song to the music library
                    System.out.print("Enter song title: ");
                    String songTitle = scanner.nextLine();
                    if (songTitle.isEmpty()) {
                        System.out.println("Song title cannot be empty.");
                        break;
                    }
                    System.out.print("Enter artist name: ");
                    String artistName = scanner.nextLine();
                    if (artistName.isEmpty()) {
                        System.out.println("Artist name cannot be empty.");
                        break;
                    }
                    library.addSong(new Song(songTitle, artistName));
                    System.out.println("Song added to the music library.");
                    break;

                case 2:
                    // Create a playlist and add songs to it
                    System.out.print("Enter playlist name: ");
                    String playlistName = scanner.nextLine();
                    library.createPlaylist(playlistName);

                    boolean addMoreSongs = true;
                    while (addMoreSongs) {
                        System.out.print("Enter song title to add to the playlist (or 'q' to finish): ");
                        String songTitleToAdd = scanner.nextLine();

                        if (songTitleToAdd.equalsIgnoreCase("q")) {
                            addMoreSongs = false;
                        } else {
                            if (songTitleToAdd.isEmpty()) {
                                System.out.println("Song title cannot be empty.");
                                continue;
                            }
                            System.out.print("Enter artist name: ");
                            String artistNameToAdd = scanner.nextLine();
                            if (artistNameToAdd.isEmpty()) {
                                System.out.println("Artist name cannot be empty.");
                                continue;
                            }
                            library.addSongToPlaylist(playlistName, new Song(songTitleToAdd, artistNameToAdd));
                            System.out.println("Song added to the playlist.");
                        }
                    }
                    break;

                case 3:
                    // Display all songs in the music library
                    library.displayMusicLibrary();
                    break;

                case 4:
                    // Display all playlists and their associated songs
                    library.displayPlaylists();
                    break;

                case 5:
                    // Find all songs by a specific artist
                    System.out.print("Enter artist name: ");
                    String artistToFind = scanner.nextLine();
                    library.findSongsByArtist(artistToFind);
                    break;

                case 0:
                    // Exit the program
                    System.out.println("Exiting...");
                    scanner.close(); // Close the Scanner before exiting
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println(); // Add a newline for readability
        }
    }
}
