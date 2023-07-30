package MusicLibrary;

/**
 * Represents a song in the music library.
 */
public class Song {
    private String title;
    private String artist;
    private int duration;

    /**
     * Constructs a Song object.
     *
     * @param title    the title of the song
     * @param artist   the artist of the song
     * @param duration the duration of the song in seconds
     */
    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " (" + duration + " seconds)";
    }
}