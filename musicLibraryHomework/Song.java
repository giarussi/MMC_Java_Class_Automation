package musicLibraryHomework;

//Represents a song in the music library
class Song {
 private String title;  // The title of the song
 private String artist; // The artist of the song

 // Constructor to initialize the song with a title and artist
 public Song(String title, String artist) {
     this.title = title;
     this.artist = artist;
 }

 // Getter method to retrieve the song title
 public String getTitle() {
     return title;
 }

 // Getter method to retrieve the artist name
 public String getArtist() {
     return artist;
 }

 // Override the toString() method to provide a formatted string representation of the song
 @Override
 public String toString() {
     return title + " - " + artist;
 }
}
