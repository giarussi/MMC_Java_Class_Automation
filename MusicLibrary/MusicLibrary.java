package MusicLibrary;

import java.util.*;

/**
 * Represents a music library management system.
 */
public class MusicLibrary {
    private List<Song> musicLibrary;
    private Map<String, List<Song>> playlists;
    private Set<String> artists;

    public MusicLibrary() {
        musicLibrary = new ArrayList<>();
        playlists = new HashMap<>();
        artists = new HashSet<>();
    }

    /**
     * Adds a song to the music library.
     *
     * @param title    the title of the song
     * @param artist   the artist of the song
     * @param duration the duration of the song in seconds
     */
    public void addSong(String title, String artist, int duration) {
        Song song = new Song(title, artist, duration);
        musicLibrary.add(song);
        artists.add(artist);
    }

    /**
     * Creates a playlist with the given name.
     *
     * @param playlistName the name of the playlist
     */
    public void createPlaylist(String playlistName) {
        playlists.put(playlistName, new ArrayList<>());
    }

    /**
     * Adds a song to the specified playlist.
     *
     * @param playlistName the name of the playlist
     * @param songTitle    the title of the song to be added
     */
    public void addSongToPlaylist(String playlistName, String songTitle) {
        List<Song> playlist = playlists.get(playlistName);
        if (playlist != null) {
            for (Song song : musicLibrary) {
                if (song.getTitle().equals(songTitle)) {
                    playlist.add(song);
                    break;
                }
            }
        }
    }

    /**
     * Displays all songs in the music library.
     */
    public void displayMusicLibrary() {
        System.out.println("Music Library:");
        for (Song song : musicLibrary) {
            System.out.println(song);
        }
    }

    /**
     * Displays all playlists and their associated songs.
     */
    public void displayPlaylists() {
        System.out.println("Playlists:");
        for (Map.Entry<String, List<Song>> entry : playlists.entrySet()) {
            String playlistName = entry.getKey();
            List<Song> playlist = entry.getValue();
            System.out.println("Playlist: " + playlistName);
            for (Song song : playlist) {
                System.out.println(song);
            }
        }
    }

    /**
     * Finds all songs by a specific artist.
     *
     * @param artist the name of the artist
     */
    public void findSongsByArtist(String artist) {
        System.out.println("Songs by " + artist + ":");
        for (Song song : musicLibrary) {
            if (song.getArtist().equals(artist)) {
                System.out.println(song);
            }
        }
    }
}
