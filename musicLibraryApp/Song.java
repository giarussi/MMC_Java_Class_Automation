package java_Homework.musicLibraryApp;


public class Song {
	// class properties for music track
	private String title, artist;
	private double duration;

	/**
	 * Constructor to create a music track with properties Accepts Title, Artist,
	 * Duration
	 * 
	 * @param title
	 * @param artist
	 * @param duration
	 */
	public Song(String title, String artist, double duration) {

		this.artist = artist;
		this.title = title;
		this.duration = duration;

	}
	
	/**
	 * Method to display all details of songs
	 */
	public void displayDetails() {
		System.out.println("Title: " + title);
		System.out.println("Artist: " + artist);
		System.out.println("Duration(mins): " + duration);
	}

	// Getters
	public String getArtist() {
		return artist;
	}

	public double getDuration() {
		return duration;
	}

	public String getTitle() {
		return title;
	}

}
