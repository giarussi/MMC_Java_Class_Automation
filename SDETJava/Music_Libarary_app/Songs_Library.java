package Music_Libarary_app;

public class Songs_Library {
	private String songname;
	private String artist;

	public void setTitle(String title) {
		this.songname = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Songs_Library(String title, String artist) {
		this.songname = title;
		this.artist = artist;
	}

	public String getTitle() {
		return songname;
	}

	public String getArtist() {
		return artist;
	}
}
