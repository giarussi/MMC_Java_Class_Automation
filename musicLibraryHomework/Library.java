package musicLibraryHomework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Library {
    private List<Song> musicLibrary;          // List to store songs in the music library
    private Map<String, List<Song>> playlists; // Map to store playlists and their associated songs

    // Constructor to initialize the music library and playlists
    public Library() {
        musicLibrary = new ArrayList<>();
        playlists = new HashMap<>();
    }

    // Method to add a song to the music library
    public void addSong(Song song) {
        musicLibrary.add(song);
    }

    // Method to create a new playlist
    public void createPlaylist(String playlistName) {
        playlists.put(playlistName, new ArrayList<>());
    }

    // Method to add a song to a playlist
    public void addSongToPlaylist(String playlistName, Song song) {
        if (playlists.containsKey(playlistName)) {
            List<Song> playlist = playlists.get(playlistName);
            playlist.add(song);
        } else {
            System.out.println("Playlist not found.");
        }
    }

    // Method to display all songs in the music library
    public void displayMusicLibrary() {
        System.out.println("Music Library:");
        if (musicLibrary.isEmpty()) {
            System.out.println("No songs in the music library.");
        } else {
            for (Song song : musicLibrary) {
                System.out.println(song);
            }
        }
        System.out.println();
        System.out.println("Songs in playlists:");
        if (playlists.isEmpty()) {
            System.out.println("No playlists found.");
        } else {
            for (List<Song> playlist : playlists.values()) {
                for (Song song : playlist) {
                    System.out.println(song);
                }
            }
        }
    }

    // Method to display all playlists and their associated songs
    public void displayPlaylists() {
        System.out.println("Playlists:");
        if (playlists.isEmpty()) {
            System.out.println("No playlists found.");
        } else {
            for (Map.Entry<String, List<Song>> entry : playlists.entrySet()) {
                String playlistName = entry.getKey();
                List<Song> playlist = entry.getValue();
                System.out.println("Playlist: " + playlistName);
                if (playlist.isEmpty()) {
                    System.out.println("No songs in the playlist.");
                } else {
                    for (Song song : playlist) {
                        System.out.println(song);
                    }
                }
            }
        }
    }

    // Method to find all songs by a specific artist
    public void findSongsByArtist(String artist) {
        System.out.println("Songs by " + artist + ":");
        boolean found = false;
        for (Song song : musicLibrary) {
            if (song.getArtist().equalsIgnoreCase(artist)) {
                System.out.println(song);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No songs found for the artist.");
        }
    }
}
