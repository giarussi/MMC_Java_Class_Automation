package homeworkDay12Music;

import java.util.*;

public class MusicLibrary {
    private List<Song> songs;
    private Map<String, List<Song>> playlists;
    private Set<String> artists;

    public MusicLibrary() {
        songs = new ArrayList<>();
        playlists = new HashMap<>();
        artists = new HashSet<>();
    }
    //adding  a song
    public void addSong(Song song) {
        songs.add(song);
        artists.add(song.getArtist());
    }
    
    //creating a playlist
    public void createPlaylist(String playlistName, List<Song> songs) {
        playlists.put(playlistName, songs);
    }

    //displaying all songs
    public void displayAllSongs() {
        for (Song song : songs) {
            System.out.println(song.toString());
        }
    }

    //displaying all playlists
    public void displayAllPlaylists() {
        for (String playlistName : playlists.keySet()) {
            System.out.println("Playlist: " + playlistName);
            List<Song> playlistSongs = playlists.get(playlistName);
            for (Song song : playlistSongs) {
                System.out.println(" - " + song.toString());
            }
        }
    }

    //searching all songs by artist
    public List<Song> findSongsByArtist(String artist) {
        List<Song> songsByArtist = new ArrayList<>();
        for (Song song : songs) {
            if (song.getArtist().equals(artist)) {
                songsByArtist.add(song);
            }
        }
        return songsByArtist;
    }

    public Set<String> getUniqueArtists() {
        return artists;
    }
}
