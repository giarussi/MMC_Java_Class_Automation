package Music_Libarary_app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Music_Library_Methods {
	private List<Songs_Library> musicLib ;
	private Map<String, List<Songs_Library>> playlists;

	public Music_Library_Methods() {
		musicLib = new ArrayList<>();
		playlists =  new HashMap<>();
	}

	public void addSong(Songs_Library song) {
		musicLib.add(song);
	}

	public void addSongToPlaylist(String playListName, Songs_Library song) {
		List<Songs_Library> playlist = playlists.get(playListName);
		if(playlist!=null) {
			playlist.add(song);
		}else {
			System.out.println("Playlist"+playListName+"does not exist");
		}
	}

	public void createPlaylist(String playlistName) {
		playlists.put(playlistName, new ArrayList<>());
	}

	public void displayAllPlaylists() {
		System.out.println("Your  Playlists:");
		for (String playlistName : playlists.keySet()) {
			System.out.println(playlistName);
			List<Songs_Library> playlist = playlists.get(playlistName);
			System.out.println("Songs in playlist are ");
			for (Songs_Library song : playlist) {
				System.out.println("-"+song.getTitle()+" is sung by "+song.getArtist());
			}
		}
	}

	public void displayAllSongs() {
		System.out.println("All songs in music library:");
		for (Songs_Library song : musicLib) {
			System.out.println(song.getTitle()+"by"+song.getArtist());
		}
	}

	public void findSongsByArtist(String artist) {
		System.out.println("Songs by Artist:"+ artist+":");
		for (Songs_Library song : musicLib) {
			if(song.getArtist().equals(artist)) {
				System.out.println(song.getTitle());
			}else {
				System.out.println("Songs by Artist is not present :=  "+artist);
			}
		}
	}
}
