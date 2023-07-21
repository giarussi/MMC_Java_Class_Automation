package homeworkDay12Music;

public class Song {
	private String title;
	private String artist;
	private int duration;

	public Song(String title, String artist, int duration) {
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}

	//Adding getters and setters
	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	@Override
	public String toString() {
		return "Title: " + title + ", Artist: " + artist + ", Duration: " + duration + "s";
	}
}
